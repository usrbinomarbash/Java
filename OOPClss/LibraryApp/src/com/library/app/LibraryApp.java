package com.library.app;
import com.library.librarian.Librarian;
import com.library.member.Member;
import com.library.loan.Loan;
import com.library.book.Book;
import com.library.loanstatus.LoanStatus;
import java.time.LocalDate;
import java.util.*;



public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Member;
        System.out.print("Member id: ");
        int mid = Integer.parseInt(sc.nextLine());
        System.out.print("Member name");
        String mname = sc.nextLine();
        System.out.println("Member address");
        String maddress = sc.nextLine();
        Member member = new Member(mid,mname,maddress);

        //Book
        System.out.println("Book ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Book Title");
        String title = sc.nextLine();
        System.out.println("Book author");
        String author = sc.nextLine();
        Book book =  new Book(isbn,title,author);


        //Librarian
        System.out.println("Librarian ID: ");
        int lid = Integer.parseInt(sc.nextLine());
        System.out.println("Librarian Name: ");
        String lname = sc.nextLine();
        Librarian librarian = new Librarian(lname, lid);


        Loan loan = new Loan(1001,member, book);
        System.out.println("\n records of the library");
        System.out.println(member);
        System.out.println(book);
        System.out.println(librarian);
        System.out.println(loan);

    }
}