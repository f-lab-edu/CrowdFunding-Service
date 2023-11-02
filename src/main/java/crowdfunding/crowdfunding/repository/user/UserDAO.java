package crowdfunding.crowdfunding.repository.user;

import crowdfunding.crowdfunding.dto.CreateUserDTO;
import crowdfunding.crowdfunding.dto.LoginDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class UserDAO {

    private final UserMapper userMapper;

    public void userSave(CreateUserDTO createUserDTO){
        userMapper.userSave(createUserDTO);
    }

    public LoginDTO findByUserId(LoginDTO loginDTO){
        return userMapper.findByUserId(loginDTO);
    }
}
