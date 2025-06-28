package com.ridesharingapp.entities.driver;

public class Driver {
    private String name;
    private String phoneNum;
    private Boolean isAvailable;

    public Driver(String name, String phoneNum, Boolean isAvailable){
        this.name=name;
        this.phoneNum=phoneNum;
        this.isAvailable=isAvailable;
    }

    public Driver(String name,String phoneNum){
        this.name=name;
        this.phoneNum=phoneNum;
        this.isAvailable=false;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum){
        this.phoneNum=phoneNum;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Boolean getIsAvailable(){
        return isAvailable;
    }
    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }


}
