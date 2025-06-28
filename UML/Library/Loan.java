public class Loan {
    private String dueDate;
    private String dateReturned;
    private Book book;
    private Member member;

    public Loan(Book book, Member member, String dueDate){
        this.dueDate=dueDate;
        this.book=book;
        this.member=member;
        this.dateReturned=null;
        this.book.setAvailability(false);
    }
}