package crowdfunding.crowdfunding.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserDTO {
    @NotEmpty(message = "아이디를 입력하세요.")
    private String id;
    @NotEmpty(message = "비밀번호는 최소 8글자 이상 입력하셔야합니다.")
    @Min(8)
    private String password;
    @NotEmpty(message = "이름을 입력하세요.")
    private String userName;
    @NotEmpty(message = "전화번호를 입력하세요.")
    private String tel;
    @NotEmpty(message = "이메일을 입력하세요")
    private String email;

}
