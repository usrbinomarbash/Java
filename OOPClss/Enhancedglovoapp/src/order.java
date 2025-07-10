import java.time.LocalDate;

public class order {
    private int orderId;
    private LocalDate orderDate;
    private String deliveryAddress;
    private orderStatus status;

    public order(int orderId, LocalDate orderDate, String deliveryAddress, orderStatus status){
        this.orderId=orderId;
        this.orderDate=orderDate;
        this.deliveryAddress=deliveryAddress;
        this.status=status;
    }

    @Override
    public String toString() {
        return "order{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", status=" + status +
                '}';
    }


    public int getOrderId(){
        return orderId;
    }

    public void setOrderId(int orderId){
        this.orderId=orderId;
    }

    public LocalDate getOrderDate(){
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate){
        this.orderDate=orderDate;
    }

    public String getDeliveryAddress(){
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress){
        this.deliveryAddress=deliveryAddress;
    }

    public orderStatus getStatus(){
        return status;
    }

    public void setStatus(orderStatus status){
        this.status=status;
    }




}
