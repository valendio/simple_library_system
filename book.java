package library;
import java.io.Serializable;
public class book implements Serializable {
    private Integer isbn;
    private String title, author;
    private Double price;

    public book() {
        isbn = 0;
        title = null;
        author = null;
        price = null;   }
    public book(Integer isbn, String title, String author, Double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price; }
    @Override
    public String toString() { //Java I/O is byte base so toString will convert from Byte to String
        return
                "\n" +"isbn : " + isbn + "\n" +
                "title : " + title + "\n" +
                "author : " + author + "\n" +
                "price : " + price +"\n";   }   }