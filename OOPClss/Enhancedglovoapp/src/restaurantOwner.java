import java.util.List;

public class restaurantOwner extends user implements manageable {
    private List<String> menu;
    private double rating;
    private String address;

    public double getRating(){
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public restaurantOwner(String address, double rating, List<String> menu){
        this.address=address;
        this.rating = rating;
        this.menu=menu;
    }

    @Override
    public void manageOrder() {

    }

    @Override
    public void manageProfile() {

    }
}
