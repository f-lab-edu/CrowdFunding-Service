package crowdfunding.crowdfunding.service;

import crowdfunding.crowdfunding.dto.UserDTO;
import crowdfunding.crowdfunding.repository.mybatis.MybatisUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginValid {
    private final MybatisUser mybatisUser;

    public UserDTO login(String id, String password){
        mybatisUser.
    }
}
