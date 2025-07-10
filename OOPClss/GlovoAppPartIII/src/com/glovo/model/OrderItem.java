package com.glovo.model;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class OrderItem {
    private int itemId;
    private int quantity;
    private double price;

    public OrderItem(int itemId, int quantity, double price){
        this.itemId=itemId;
        this.price=price;
        this.quantity=quantity;

    }

    public void setStatus(OrderStatus status){
        this.status=status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public int getItemId(){
        return itemId;
    }

    public void setItemId(int itemId){
        this.itemId=itemId;
    }

    public double getTotalPrice() {
        return quantity * price;
    }



}