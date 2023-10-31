package crowdfunding.crowdfunding.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LoginDTO {
    @NotEmpty(message = "아이디를 입력해주세요")
    private String id;
    @NotEmpty(message = "비밀번호를 입력해주세요")
    private String password;

    private String userName;
    private String tel;
    private String email;
    private LocalDateTime userCreateDate;
    private LocalDateTime userUpdateDate;
}
