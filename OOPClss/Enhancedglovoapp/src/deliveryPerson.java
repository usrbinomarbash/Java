import java.time.LocalDate;
import java.util.List;

public class deliveryPerson extends user {
    private String vehicleType;
    private boolean availability;
    private LocalDate deliveryTime;

    public deliveryPerson(String name, String phoneNumber, String email, String password, String vehicleType, boolean availability,LocalDate deliveryTime){
        super.setName(name);
        super.setPhoneNumber(phoneNumber);
        super.setEmail(email);
        super.setPassword(password);
        this.vehicleType=vehicleType;
        this.availability=availability;
        this.deliveryTime=deliveryTime;
    }

    public void setVehicleType(String vehicleType){
        this.vehicleType=vehicleType;
    }

    public String getVehicleType(){
        return vehicleType;
    }

    public void setAvailability(boolean availability){
        this.availability=availability;
    }

    public boolean getAvailability(){
        return availability;
    }

    public void setDeliveryTime(LocalDate deliveryTime){
        this.deliveryTime=deliveryTime;
    }

    public LocalDate getDeliveryTime(){
        return deliveryTime;
    }

    @Override
    public String toString() {
        return "A Person is delivering your order with a: {" +
                "vehicleType='" + vehicleType + '\'' +
                ", availability=" + availability +
                ", deliveryTime=" + deliveryTime +
                '}';
    }


    public List<order> getOrders(){
        return orders;
    }

    public void setOrders(List<order> orders){
        this.orders=order;
    }

    public void addOrder(order order) {
        if (orders != null) {
            orders.add(order);
        }
    }

    public void deliverOrder() {
        if (availability && orders != null) {
            for (order order : orders) {
                if (order.getStatus() == orderStatus.PENDING) {
                    order.setStatus(orderStatus.DELIVERED); // Update status to DELIVERED
                    System.out.println("Order " + order.getOrderId() + " delivered.");
                }
            }
            availability = false; // Mark as unavailable after delivery
        } else {
            System.out.println("Delivery person unavailable or no orders assigned.");
        }
    }

    @Override
    public String toString() {
        return "DeliveryPerson{" +
                "name='" + getName() + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", availability=" + availability +
                ", deliveryTime=" + deliveryTime +
                ", orders=" + orders +
                '}';
    }
}


