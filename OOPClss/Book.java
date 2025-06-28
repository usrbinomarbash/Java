import java.util.*;


public class Book{
    public String title;
    public String author;
    public String isbn;

    public Book(String title, String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    public void getInfo(){
        System.out.println("The book has a title"+title+" and an author "+author+" with an ISBN number of: "+isbn)
    }

    public String toString(){
        return "Book [Title: " + title + ", Author: " + author + " ,ISBN: " + "]";
    }
}