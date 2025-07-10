package com.glovo.model;

public class Restaurant{
    private String name;
    private String address;
    private double rating;

    public Restaurant(String name, String address, double rating){
        this.name=name;
        this.address=address;
        this.rating=rating;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public double getRating(){
        return rating;
    }

    public void setRating(double rating){
        this.rating=rating;
    }

    @Override
    public String toString() {
        return String.format(
                "Restaurant: %s, Address: %s, Rating: %.1f",
                name,
                address,
                rating
        );
    }


}