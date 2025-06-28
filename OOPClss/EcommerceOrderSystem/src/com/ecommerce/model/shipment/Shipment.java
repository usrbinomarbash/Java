package com.ecommerce.model.shipment;

import java.time.LocalDate;
import com.ecommerce.model.order.Order;


public class Shipment{
    private int shipmentId;
    private Order order;
    private LocalDate shipDate;
    private String carrier;


    public Shipment(int shipmentId, Order order, LocalDate shipDate, String carrier){
        this.shipmentId=shipmentId;
        this.order=order;
        this.shipDate=shipDate;
        this.carrier=carrier;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "shipmentId=" + shipmentId +
                ", order=" + order +
                ", shipDate=" + shipDate +
                ", carrier='" + carrier + '\'' +
                '}';
    }


}