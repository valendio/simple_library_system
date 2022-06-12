package library;
import java.util.*;
import java.io.Serializable;

public class library implements Serializable {

    private List<book> collection;
    public  library(){
        collection = new ArrayList<book>();
    }
public void addBook(book Book){
        collection.add(Book);
    }
    @Override
    public String toString() {
       String total = "\n";
        Iterator<book> i = collection.iterator();
        while (i.hasNext()) {
            book b = (book) i.next();
            total = total + b.toString();
        }
       return total;}   }
