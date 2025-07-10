import java.time.LocalDate;

public class orderItem extends order {
    private int itemId;
    private int quantity;
    private double price;

    public orderItem(int itemId, int quantity, double price){
        super(orderId,orderDate,deliveryAddress, status)
        this.itemId=itemId;
        this.quantity=quantity;
        this.price=price;
    }

    public void setItemId(int itemId){
        this.itemId=itemId;
    }

    public int getItemId(){
        return itemId;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }


    public double getTotalPrice(double price, int quantity){
        return((quantity)*price);
    }
    public String toString(){
        return("An order has been place with an item id of:"+this.itemId+"and a price of: "+this.price+" and "+this.quantity+" number of items of this have been ordered");
    }
}
