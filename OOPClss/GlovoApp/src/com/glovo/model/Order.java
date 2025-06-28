package com.glovo.model;

import java.time.LocalDate;


public class Order{
    private int orderId;
    private LocalDate orderDate;
    private String deliveryAddress;
    private OrderStatus status;
    private Customer customer;
    private Courrier courrier;
    private Restaurant restaurant;

    public Order(int orderId, String deliveryAddress, Customer customer, Courrier courrier, Restaurant restaurant) {
        this(orderId, LocalDate.now(), deliveryAddress, OrderStatus.PENDING, customer, courrier, restaurant);
    }

    public Order(int orderId, String deliveryAddress, Customer customer, Courrier courrier, Restaurant restaurant) {
        this(orderId, LocalDate.now(), deliveryAddress, OrderStatus.PENDING, customer, courrier, restaurant);
    }

    public Order(int orderId, LocalDate orderDate, String deliveryAddress, OrderStatus status, Customer customer, Courrier courrier, Restaurant restaurant)
    {
        this.orderId         = orderId;
        this.orderDate       = orderDate;
        this.deliveryAddress = deliveryAddress;
        this.status          = status;
        this.customer        = customer;
        this.courrier        = courrier;
        this.restaurant      = restaurant;
    }
    public int getOrderId(){
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getDeliveryAddress(){
        return deliveryAddress;
    }

    public OrderStatus getStatus(){
        return status;
    }

    public void setStatus(OrderStatus status){
        this.status=status;
    }

    public Customer getCustomer(){
        return customer;
    }

    public Courrier getCourrier(){
        return courrier;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    @Override
    public String toString(){
        return String.format("Order id: %d, Date: %s, Status: %s, Delivery Address: %s, Customer: %s, Courrier: %s, Restaurant: %s",orderId, orderDate,status,deliveryAddress,customer,courrier,restaurant);
    }
}