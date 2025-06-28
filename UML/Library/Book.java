public class Book{
    private String ISBN;
    private String title;
    private boolean isAvailable;

    public Book(String ISBN, String title, boolean isAvailable){
        this.ISBN=ISBN;
        this.title=title;
        this.isAvailable=true;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean available){
        isAvailable=available
    }
}