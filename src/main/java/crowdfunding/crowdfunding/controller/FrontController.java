package crowdfunding.crowdfunding.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FrontController {
    @GetMapping
    public String guestfront(HttpSession httpSession,Model model)
    {
        model.addAttribute("session",httpSession);
        return "frontview/front";
    }


}
