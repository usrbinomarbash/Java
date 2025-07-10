package com.glovo.model;

import java.util.List;
import com.glovo.manageable.Manageable;

public class RestaurantOwner extends User implements Manageable{
    private String address;
    private double rating;
    private List<String> menu;

    public RestaurantOwner(String name, String phoneNumber, String email, String password, String address, double rating, List<String>menu){
        super(name,phoneNumber,email,password);
        this.address=address;
        this.rating=rating;
        this.menu=menu;
    }

    public void setRating(double rating){
        this.rating=rating;
    }

    public double getRating() {
        return rating;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    @Override
    public void manageOrder(){
        System.out.println("Restaurant Owner managing: "+getName()+"'s orders");
    }

    @Override
    public void manageProfile(){
        System.out.println("Restaurant Owner managing: "+getName()+"'s profile");
    }

    @Override
    public String toString(){
        return super.toString()+", address: "+address+" rating: "+rating+", menu: "+menu;
    }



}