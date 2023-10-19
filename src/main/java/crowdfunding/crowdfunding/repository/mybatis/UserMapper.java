package crowdfunding.crowdfunding.repository.mybatis;

import crowdfunding.crowdfunding.dto.CreateUserDTO;
import crowdfunding.crowdfunding.dto.LoginDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    void userSave(CreateUserDTO createUserDTO);

    String findUserId(@Param("id") String id, @Param("password") String password);

    //public UserDTO userlist(UserDTO userDTO);

    //public UserDTO findUser(String id);
}
