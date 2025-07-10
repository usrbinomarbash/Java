/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import static users.UserCollection.usersList;


public class UserNotFoundException extends Exception {

    private String username;

    public UserNotFoundException(String username) {
        super("The username :" + username + " does not exist.");
        this.username = username;
    }

   
    public String getUname() {
        return username;
    }

    
}
