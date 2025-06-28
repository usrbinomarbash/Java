import java.util.*;


public Member extends User{
    private List<Loan> loans = new ArrayList<>();

    public void borrowBook(Book book, String dueDate){
        Loan loan = new Loan(book, this, dueDate);
        loans.add(loan);
    }

    public void returnBook(Book book){
        for(Loan loan: loans){
            if(loan.getBook()==book && loan.getDateReturned() == null)
                loan.setDateReturned("2025-04-25");
                book.setAvailable(true);
                break;
        }
    }
}