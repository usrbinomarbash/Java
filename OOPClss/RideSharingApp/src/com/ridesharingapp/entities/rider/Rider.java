package com.ridesharingapp.entities.rider;

public class Rider {
    private String name;
    private String location;
    private String email;
    private String phoneNum;


    public Rider(String name, String location, String email){
        this.name=name;
        this.location=location;
        this.phoneNum="N/A";
        this.email=email;
    }

    public Rider(String name,String location,String email,String phoneNum){
        this.name=name;
        this.location=location;
        this.email=email;
        this.phoneNum=phoneNum;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location=location;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum){
        this.phoneNum=phoneNum;
    }

    @Override
    public String toString(){
        return("A new Rider has been created who's name is: "+this.name+" and lives at "+this.location+" and can be reached at: "+this.phoneNum+" and his email is: "+this.email);
    }
}
