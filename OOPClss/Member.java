public class Member{
    public String name;
    public int member_id;

    public void borrow(Book book){
        System.out.println("You borrowed the following: "+book+" today!");
    }

}