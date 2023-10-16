package crowdfunding.crowdfunding.controller;

import crowdfunding.crowdfunding.repository.mybatis.MybatisUser;
import crowdfunding.crowdfunding.dto.LoginDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class LoginController {
    private final MybatisUser userRepository;
    @GetMapping("/login")
    public String login(@ModelAttribute LoginDTO loginDTO){
        return "userview/login";
    }

 /*   @PostMapping("/login")
    public String loginVal(@Valid @ModelAttribute LoginDTO loginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "userview/login";
        }

    }*/
}
