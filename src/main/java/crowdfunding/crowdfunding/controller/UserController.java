package crowdfunding.crowdfunding.controller;

import crowdfunding.crowdfunding.Repository.UserRepository;
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
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;
    @GetMapping("/created")
    public String createId(@ModelAttribute UserDTO userDTO){
        return "userview/createid";
    }

    @PostMapping("/created")
    public String userValid(@Valid @ModelAttribute UserDTO userDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "userview/createid";
        }

        userRepository.userlist(userDTO);
        return "redirect:/";
    }

}
