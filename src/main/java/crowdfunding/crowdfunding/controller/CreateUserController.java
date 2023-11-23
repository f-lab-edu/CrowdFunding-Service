package crowdfunding.crowdfunding.controller;


import crowdfunding.crowdfunding.dto.CreateUserDTO;
import crowdfunding.crowdfunding.ConfirmPassword;
import crowdfunding.crowdfunding.service.CreateUserService;
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
public class CreateUserController {
    private final CreateUserService createUserService;
    @GetMapping("/created")
    public String createId(@ModelAttribute CreateUserDTO createUserDTO){
        return "userview/createid";
    }

    @PostMapping("/created")
    public String userValid(@Valid @ModelAttribute CreateUserDTO createUserDTO, BindingResult bindingResult) {

        ConfirmPassword confirmPassword = new ConfirmPassword();

        if(!confirmPassword.passwordValid(createUserDTO.getUserPassword(), createUserDTO.getPasswordValid())){
            bindingResult.reject("passwordFail","비밀번호가 일치하지 않습니다.");
            log.info("비밀번호 불일치");
        }
        if(bindingResult.hasErrors()){
            return "userview/createid";
        }
        log.info("createUser = {}",createUserDTO);
        createUserService.createUser(createUserDTO);
        return "redirect:/";
    }

}
