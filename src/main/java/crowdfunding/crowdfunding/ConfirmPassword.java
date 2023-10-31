package crowdfunding.crowdfunding;


public class ConfirmPassword {
    public boolean passwordValid(String password, String passwordValid){
        if(!password.equals(passwordValid)){
            return false;    
        }
        return true;
    }
}
