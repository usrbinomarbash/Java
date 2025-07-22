package com.glovo.model;


public class User{
    private String name;
    private String phoneNumber;
    private String email;
    private String password;

    public User(String name, String phoneNumber, String email, String password){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.password=password;
    }


    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getPassword(){
        return password;
    }

    @Override
    public String toString()
    {
        return("User: "+this.name+" has a phone Number of : "+this.phoneNumber+" and an email of: "+this.email+" and a password: "+this.password);
    }

    public void login(String email, String password){
        System.out.println(name + " logged in with " + email);
    }

    public void logout(String email, String password){
        System.out.println(name + " logged out");
    }


}