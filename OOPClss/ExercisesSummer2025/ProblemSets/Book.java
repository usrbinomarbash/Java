import java.util.*;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public String toString(){
        return String.format("Book: {title='%s', author='%s', ISBN='%s'}",title, author,ISBN);
    }
}