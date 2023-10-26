package crowdfunding.crowdfunding.controller;

import crowdfunding.crowdfunding.dto.LoginDTO;
import crowdfunding.crowdfunding.repository.mybatis.MybatisUser;
import crowdfunding.crowdfunding.service.LoginValid;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequestMapping("/")
public class FrontController {
    @GetMapping
    public String guestfront(HttpSession httpSession,Model model)
    {
        model.addAttribute("session",httpSession);
        return "frontview/front";
    }

    /*@GetMapping("front")//
    public String userfront() {
        return "frontview/userfront";
    }*/


}
