package crowdfunding.crowdfunding.repository.mybatis;

import crowdfunding.crowdfunding.dto.CreateUserDTO;
import crowdfunding.crowdfunding.dto.LoginDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    void userSave(CreateUserDTO createUserDTO);
    LoginDTO findByUserId(LoginDTO loginDTO);
}
