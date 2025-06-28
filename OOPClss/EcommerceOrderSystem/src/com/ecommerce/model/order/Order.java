package com.ecommerce.model.order;
package com.ecommerce.model.customer;
package com.ecommerce.model.orderitem;

public class Order{
    private int orderId;
    private LocalDate date;
    private Customer customer;
    private Orderitem orderitem[];


    public Order(int orderId, Customer customer, Orderitem orderitem){
        this.orderId=orderId;
        this.customer=customer;
        this.orderitem=orderitem;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", date=" + date +
                ", customer=" + customer +
                ", orderitem=" + java.util.Arrays.toString(orderitem) +
                '}';
    }


}