package crowdfunding.crowdfunding.service;


import crowdfunding.crowdfunding.dto.CreateUserDTO;

public class UserValid {

    //CreateUserDTO userDTO = new CreateUserDTO();
    public boolean passwordValid(String password, String passwordValid){
        if(!password.equals(passwordValid)){
            return false;    
        }
        return true;
    }

    /*public boolean idDuplicate(String id){
        if()
    }*/
}
