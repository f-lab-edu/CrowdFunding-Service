package crowdfunding.crowdfunding.repository.mybatis;

import crowdfunding.crowdfunding.dto.CreateUserDTO;
import crowdfunding.crowdfunding.dto.LoginDTO;
import crowdfunding.crowdfunding.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class MybatisUser implements UserRepository {

    private final UserMapper userMapper;

    @Override
    public CreateUserDTO userSave(CreateUserDTO createUserDTO){
        userMapper.userSave(createUserDTO);
        return createUserDTO;
    }

    @Override
    public String findUserId(LoginDTO loginDTO){


        return userMapper.findUserId(loginDTO);
    }
}




