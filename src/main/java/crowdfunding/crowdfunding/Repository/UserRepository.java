package crowdfunding.crowdfunding.Repository;

import crowdfunding.crowdfunding.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    private Map<String, UserDTO> user = new ConcurrentHashMap<>();

    public UserDTO userlist(UserDTO userDTO){ //가입한유저의 정보를 저장
        user.put(userDTO.getId(),userDTO);
        return userDTO;
    }

    public UserDTO findUser(String id){
        return user.get(id);
    }



}
