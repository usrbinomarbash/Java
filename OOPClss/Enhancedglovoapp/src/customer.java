public class customer extends user implements manageable {
    private String address;
    private String paymentInfo;
    public order currentOrder;

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getPaymentInfo(){
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo){
        this.paymentInfo=paymentInfo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", paymentInfo='" + paymentInfo + '\'' +
                '}';
    }

    @Override
    public void manageOrder(){
        if(currentOrder != null &currentOrder.getStatus()==orderStatus.PENDING)
        {
            currentOrder.setStatus(orderStatus.DELIVERED);
        }
    }

    @Override
    public void manageProfile(){

    }

    public void placeOrder(){

    }

    public order getCurrentOrder(){
        return currentOrder;
    }

    public void setCurrentOrder(order currentOrder){
        this.currentOrder= currentOrder;
    }




}
