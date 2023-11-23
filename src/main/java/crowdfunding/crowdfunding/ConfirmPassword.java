package crowdfunding.crowdfunding;


import org.springframework.util.StringUtils;

public class ConfirmPassword {

    public boolean passwordValid(String password, String passwordCheck){
        if(!(StringUtils.hasText(password)&&StringUtils.hasText(passwordCheck))){
            return false;
        }
        return password.equals(passwordCheck);
    }
}
