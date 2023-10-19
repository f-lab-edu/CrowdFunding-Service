package crowdfunding.crowdfunding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FrontController {


    @GetMapping
    public String guestfront(){
        return "frontview/guestfront";
    }

    @GetMapping("front")//
    public String userfront(){ return "frontview/userfront";}


}
