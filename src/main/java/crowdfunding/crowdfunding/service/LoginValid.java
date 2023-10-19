package crowdfunding.crowdfunding.service;

import crowdfunding.crowdfunding.dto.LoginDTO;
import crowdfunding.crowdfunding.repository.mybatis.MybatisUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginValid {
    private final MybatisUser mybatisUser;

    public String loginValid(LoginDTO loginDTO){
        //String login = mybatisUser.findUserId(loginDTO);
        return mybatisUser.findUserId(loginDTO);

    }
}
