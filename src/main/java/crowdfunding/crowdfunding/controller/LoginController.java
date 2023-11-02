package crowdfunding.crowdfunding.controller;


import crowdfunding.crowdfunding.dto.LoginDTO;
import crowdfunding.crowdfunding.service.LoginService;
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
public class LoginController {
    private final LoginService loginService;
    @GetMapping("/login")
    public String login(@ModelAttribute LoginDTO loginDTO){
        return "userview/login";
    }

    @PostMapping("/login")
    public String loginValid(@Valid @ModelAttribute LoginDTO loginDTO, BindingResult bindingResult,
                             HttpServletRequest httpServletRequest) {

        LoginDTO loginStart = loginService.loginValid(loginDTO);
         log.info("LoginCheck = {}",loginStart);

         if(loginStart == null){
             bindingResult.reject("loginFail","아이디 또는 비밀번호가 틀립니다.");
             return "userview/login";
         }

        if(bindingResult.hasErrors()){
            return "userview/login";
        }

        HttpSession httpSession = httpServletRequest.getSession(true);
        httpSession.setMaxInactiveInterval(1200);
        httpSession.setAttribute("loginSession",loginStart);
        log.info("session timeout = {}",httpSession.getMaxInactiveInterval());

        return "redirect:/";
    }


    @PostMapping("/logout")
    public String logout(HttpServletRequest httpServletRequest) {
            HttpSession httpSession = httpServletRequest.getSession(false);
            if (httpSession != null) {
                log.info("{} logout",httpSession.getAttribute("loginSession"));
                httpSession.invalidate();
            }

        return "redirect:/";
    }
}
