package crowdfunding.crowdfunding.service;

import crowdfunding.crowdfunding.repository.mybatis.MybatisUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginValid {
    private final MybatisUser userRepository;

    /*public UserDTO login(String id, String password){
        return userRepository.findUser(id).
    }*/
}
