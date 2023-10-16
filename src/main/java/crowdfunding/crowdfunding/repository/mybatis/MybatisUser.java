package crowdfunding.crowdfunding.repository.mybatis;

import crowdfunding.crowdfunding.dto.UserDTO;
import crowdfunding.crowdfunding.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class MybatisUser implements UserRepository {

    private final UserMapper userMapper;

    @Override
    public UserDTO userSave(UserDTO userDTO){
        userMapper.userSave(userDTO);
        return userDTO;
    }

   /* private Map<String, UserDTO> user = new ConcurrentHashMap<>();

    public UserDTO userlist(UserDTO userDTO){ //가입한유저의 정보를 저장
        user.put(userDTO.getId(),userDTO);
        return userDTO;
    }

    public UserDTO findUser(String id){
        return user.get(id);
    }*/



}
