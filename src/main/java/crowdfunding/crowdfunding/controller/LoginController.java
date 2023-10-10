package crowdfunding.crowdfunding.controller;

import crowdfunding.crowdfunding.Repository.UserRepository;
import crowdfunding.crowdfunding.dto.LoginDTO;
import crowdfunding.crowdfunding.dto.UserDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final UserRepository userRepository;
    @GetMapping("/login")
    public String login(@ModelAttribute LoginDTO loginDTO){
        return "userview/login";
    }

    @PostMapping("/login")
    public String loginVal(@Valid @ModelAttribute LoginDTO loginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "userview/login";
        }

    }
}
