/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Administrator
 */
public class UserCollection {

    public static ArrayList<User> usersList;

    public UserCollection() {
        usersList = new ArrayList<User>();
        //hardcoded, should be removed later
        usersList.add(new User("totoFN", "totoLN", "toto", "toto"));
        usersList.add(new User("fooFN", "fooLN", "foo", "foo"));

    }

    public static boolean register() {
        Scanner u = new Scanner(System.in);

        if(UserList.contains(u)){
            throw UserNotFoundException("User already registerd in the system.");
        }
        else{
            usersList.add(u);
            return true;
        }
    }

    public static boolean login(User theUser) throws UserNotFoundException{
        for(User user: usersList){
            if(user.equals(theUser)){
                return user.authenticate(theUser.getPass());
            }
        }
        throw new UserNotFoundException(theUser.getUname());
    }

}
