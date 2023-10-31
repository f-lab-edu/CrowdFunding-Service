package crowdfunding.crowdfunding.repository.mybatis;

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
        System.out.println("아이디"+loginDTO.getId()+"비번"+loginDTO.getPassword());
        System.out.println("결과"+userMapper.findByUserId(loginDTO));

        return userMapper.findByUserId(loginDTO);
    }
}




