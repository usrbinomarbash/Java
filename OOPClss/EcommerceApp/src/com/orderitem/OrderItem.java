package com.orderitem;

public class OrderItem {
    private String productName;
    private double price;

    public OrderItem(String productName, double price){
        this.productName=productName;
        this.price=price;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

}


