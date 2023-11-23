package crowdfunding.crowdfunding;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                             Object handler) throws Exception {


        HttpSession session = httpServletRequest.getSession(false);
        if(session == null || session.getAttribute("loginSession") == null){
            httpServletResponse.sendRedirect("/user/login");
            return false;
        }
        return true;
    }
}
