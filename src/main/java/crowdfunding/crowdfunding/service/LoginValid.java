package crowdfunding.crowdfunding.service;

import crowdfunding.crowdfunding.Repository.UserRepository;
import crowdfunding.crowdfunding.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginValid {
    private final UserRepository userRepository;

    public UserDTO login(String id, String password){
        return userRepository.findUser(id).
    }
}
