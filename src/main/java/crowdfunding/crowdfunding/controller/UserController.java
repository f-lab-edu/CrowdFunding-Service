package crowdfunding.crowdfunding.controller;

import crowdfunding.crowdfunding.repository.mybatis.MybatisUser;
import crowdfunding.crowdfunding.dto.CreateUserDTO;
import crowdfunding.crowdfunding.service.UserValid;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final MybatisUser mybatisUser;
    @GetMapping("/created")
    public String createId(@ModelAttribute CreateUserDTO createUserDTO){
        return "userview/createid";
    }

    @PostMapping("/created")
    public String userValid(@Valid @ModelAttribute CreateUserDTO createUserDTO, BindingResult bindingResult,
                            HttpServletRequest httpServletRequest){

        UserValid pass = new UserValid();

        if(!pass.passwordValid(createUserDTO.getPassword(), createUserDTO.getPasswordValid())){
            bindingResult.reject("passwordFail","비밀번호가 일치하지 않습니다.");
            log.info("비밀번호 불일치");
        }
        if(bindingResult.hasErrors()){
            return "userview/createid";
        }
        System.out.println(createUserDTO);
        mybatisUser.userSave(createUserDTO);
        return "redirect:/";
    }

}
