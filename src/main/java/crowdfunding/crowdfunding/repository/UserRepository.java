package crowdfunding.crowdfunding.repository;

import crowdfunding.crowdfunding.dto.CreateUserDTO;
import crowdfunding.crowdfunding.dto.LoginDTO;

import java.util.Optional;

public interface UserRepository {

    public CreateUserDTO userSave(CreateUserDTO createUserDTO);

    String findUserId(LoginDTO loginDTO);
}
