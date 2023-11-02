package crowdfunding.crowdfunding.repository.user;

import crowdfunding.crowdfunding.dto.CreateUserDTO;
import crowdfunding.crowdfunding.dto.LoginDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    void userSave(CreateUserDTO createUserDTO);
    LoginDTO findByUserId(LoginDTO loginDTO);
}
