package com.glovo.app;

import com.glovo.model.*;
import com.glovo.exception.EmptyOrderException;


import java.util.*;
import java.io.*;


public class GlovoApp {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        OrderManager manager = new OrderManager();

        while(true){
            System.out.println("\n--- Glovo Order Manager Menu ----");
            System.out.println("1. Add An Order");
            System.out.println("2. Remove An Order");
            System.out.println("3. View Order");
            System.out.println("4. Search Orders By Status");
            System.out.println("5. Sort Orders By Date");
            System.out.println("6. Save Order");
            System.out.println("7. Load Order");
            System.out.println("0. Quit");
            System.out.println("Please make an option: ");
            try{
                int choice = Integer.parseInt(sc.nextLine());

                switch(choice){
                    case 1:
                        System.out.print("Order ID: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Delivery Address: ");
                        String address = sc.nextLine();
                        Customer customer = new Customer("Younes", "0600000000", "Rabat");
                        Restaurant restaurant = new Restaurant("PizzaHut", "Agdal", 4.6);
                        DeliveryPerson courier = new DeliveryPerson("Ali", "0655544444", "Bike");
                        Order order = new Order(id, address, customer, courier, restaurant);
                        manager.addOrder(order);
                        System.out.println("Order added.");
                        break;
                    case 2:
                        if(manager.getAllOrders().isEmpty()){
                            throw new EmptyOrderException("No Orders To Remove");
                        }
                        System.out.println("Enter index of order to delete");
                        int index = Integer.parseInt(sc.nextLine());
                        manager.removeOrder(manager.getAllOrders.get(index));
                        System.out.println("Order has been removed successfully");
                        break;

                    case 3:
                        if(manager.getAllOrders().isEmpty()){
                            throw new EmptyOrderException("No Orders To Display");
                        }
                        for(Order ord: manager.getAllOrders()){
                            System.out.println(ord);

                        }
                        break;

                    case 4:
                        System.out.println("Status (PENDING, DISPATCHED, DELIVERED): ");
                        OrderStatus status = OrderStatus.valueOf(sc.nextLine.toUpperCase());
                        List<Order> results = manager.searchByStatus(status);

                        if(results.isEmpty()){
                            System.out.println("No Orders to show");
                        }
                        else{
                            for(Order o: results){
                                System.out.println(o);
                            }
                        }
                        break;

                    case 5:
                        manager.sortByDate();
                        System.out.println("Orders Arranged By Date");
                        break;

                    case 6:
                        manager.saveToFile("data/glovo/orders.ser");
                        System.out.println("Orders saved.");
                        break;
                    case 7:
                        manager.loadFromFile("data/glovo/orders.ser");
                        System.out.println("Orders loaded successfully");
                        break;

                    case 0:
                        System.out.println("Leave");
                        return;

                    default:
                        System.out.println(" Incorrect option");
                }
            }
            catch (EmptyOrderListException e) {
                System.out.println(" " + e.getMessage());
                System.out.println(e.recoverySuggestion());
            }

            catch (Exception e) {
                System.out.println("💥 Error: " + e.getMessage());
            }
        }
    }
}

}