package crowdfunding.crowdfunding.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UserDTO {
    @NotEmpty(message = "아이디를 입력하세요.")
    private String id;
    @NotEmpty(message = "비밀번호를 입력하세요")
    @Length(min = 8, max = 15, message = "비밀번호는 최소8글자, 최대15글자로 입력하셔야합니다.")
    private String password;
    @NotEmpty(message = "비밀번호가 일치하지 않습니다.")
    private String passwordValid;
    @NotEmpty(message = "이름을 입력하세요.")
    private String userName;
    @NotEmpty(message = "전화번호를 입력하세요.")
    private String tel;
    @NotEmpty(message = "이메일을 입력하세요")
    private String email;

}
