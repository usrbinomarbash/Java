package com.glovo.model;
import java.io.*;
import java.util.*;
import com.glovo.model.Owner;
import com.glovo.model.OrderStatus;

public class OrderManager implements Serializable {
    public List<Order> orders;

    public OrderManager(){
        this.orders=new ArrayList<>();
    }

    public void addOrder(Order o){
        orders.add(o);
    }

    public void removeOrder(Order o){
        orders.remove(o);
    }

    public void editOrder(int index, Order newOrder){
        if(index>=0 && index<orders.size()){
            orders.set(index,newOrder);
        }
    }

    public List<Order>SearchByStatus(OrderStatus status){
        List<Order> results = new ArrayList<>();
        for(Order o:orders){
            if(o.getStatus()==status){
                results.add(o)
            }
        }
        return results;
    }

    public void sortByDate(){
        orders.sort(Comparator.comparing(Order::getOrderDate));
    }

    public List<Order> getAllOrders(){
        return orders;
    }

    public void saveToFile(String filePath) throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(orders);
        oos.close();
    }

    public void loadFromFile(String filePath){
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        orders=(List<Order>)ois.readObject();
        ois.close();
    }

}