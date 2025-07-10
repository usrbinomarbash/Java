/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.Scanner;
import users.User;
import users.UserCollection;

import users.UserNotFoundException;

/**
 *
 * @author Administrator
 */
public class Authentication {

    private static Scanner sc;
    private static UserCollection coll;

    public static void main(String[] args) {
        coll = new UserCollection();
        sc = new Scanner(System.in);

        loop:
        while (true) {
              System.out.print("To register type 1, to login type 2 : ");
            int choice = sc.nextInt();
            switch (choice) {
                //test the registration process
                case 1:
                    registerNewUser();
                    break;

                //test the process login
                case 2:
                    processLogin();
                    break;
                default:
                    break loop;
            }

        }
        sc.close();
    }

    private static void registerNewUser() {

        while (true) {
            //prompt the user
            System.out.print("Please provide your first name: ");
            String fname = sc.next();
            System.out.print("Please provide your last name: ");
            String lanme = sc.next();
            System.out.print("Please choose a user name: ");
            String uname = sc.next();
            System.out.print("Please provide a password: ");
            String pass = sc.next();
            User u = new User(uname, pass, uname, uname);

            try{
                if(UserCollection.register(u)){
                    System.out.println("User registered successfully");
                }
            }
            catch(UserExistsException e){
                System.out.println("Registration Failed Username"+e.getUsername()+": already exists in the system.");
            }

        }

    }

    private static void processLogin() {

            //prompt the user
            System.out.print("Please provide a user name : ");
            String uname = sc.next();
            System.out.print("Please provide a password : ");
            String pass = sc.next();

            User u = new User(uname, pass, uname, uname);
            try{
                if(UserCollection.login(u)){
                    System.out.println("Successful");
                }
            }
            catch (UserNotFoundException e){
                System.out.println("Login fialed"+e.getMessage());
            }

            
    }

}
