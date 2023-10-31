package crowdfunding.crowdfunding.service;

import crowdfunding.crowdfunding.dto.LoginDTO;
import crowdfunding.crowdfunding.repository.mybatis.UserDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final UserDAO userDAO;

    public LoginDTO loginValid(LoginDTO loginDTO){

        return userDAO.findByUserId(loginDTO);

    }
}
