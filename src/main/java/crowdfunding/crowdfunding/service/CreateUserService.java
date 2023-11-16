package crowdfunding.crowdfunding.service;

import crowdfunding.crowdfunding.dto.CreateUserDTO;
import crowdfunding.crowdfunding.repository.user.UserDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserService {
    private final UserDAO userDAO;
    public void createUser(CreateUserDTO createUserDTO){
        userDAO.userSave(createUserDTO);
    }
}
