package crowdfunding.crowdfunding.controller;

import crowdfunding.crowdfunding.repository.mybatis.MybatisUser;
import crowdfunding.crowdfunding.dto.UserDTO;
import crowdfunding.crowdfunding.service.UserValid;
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
    public String createId(@ModelAttribute UserDTO userDTO){
        return "userview/createid";
    }

    @PostMapping("/created")
    public String userValid(@Valid @ModelAttribute UserDTO userDTO, BindingResult bindingResult){

        UserValid pass = new UserValid();

        if(!pass.passwordValid(userDTO.getPassword(),userDTO.getPasswordValid())){
            bindingResult.reject("passwordFail","비밀번호가 일치하지 않습니다.");
            log.info("비밀번호 불일치");
        }


        if(bindingResult.hasErrors()){
            return "userview/createid";
        }




        mybatisUser.userSave(userDTO);
        return "redirect:/";
    }

}
