    package com.order;
    import com.orderitem.OrderItem;
    import com.customer.Customer;

    import java.time.LocalDate;
    import java.util.ArrayList;

    public class Order {
        private int orderId;
        private LocalDate date;
        private Customer customer;
        private ArrayList<OrderItem> items;

        public Order(int orderId, LocalDate date, Customer customer, ArrayList<OrderItem> item){
            if (orderId <= 0) {
                throw new IllegalArgumentException("Order ID must be positive");
            }
            if (date == null) {
                throw new IllegalArgumentException("Date cannot be null");
            }
            if (customer == null) {
                throw new IllegalArgumentException("Customer cannot be null");
            }

            this.orderId=orderId;
            this.date=date;
            this.customer=customer;
            this.items=item;
        }

        public Order(int orderId, Customer customer){
            this(orderId, LocalDate.now(), customer, new ArrayList<>());
        }

        public int getOrderId(){
            return orderId;
        }

        public LocalDate getDate(){
            return date;
        }

        public Customer getCustomer(){
            return customer;
        }

        public ArrayList<OrderItem> getItems(){
            return new ArrayList<>(items);
        }
    }
