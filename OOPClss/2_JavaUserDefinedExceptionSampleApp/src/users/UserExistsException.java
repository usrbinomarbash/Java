package users;

public class UserExistsException extends Exception{
    private String username;
    public UserExistsException(String username){
        this.username=username;
    }

    public String getUsername(){
        return username;
    }
}