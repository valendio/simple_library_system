package library;
import java.io.*;
import java.util.Scanner;

public class main{
    static String fileName = null;
    static library lib = new library();
    static Scanner input = new Scanner(System.in);
    static boolean run = true;
    static String username;
    static String password;
    static data datainfo = new data();
    static boolean userstatus = true;

    public static void main(String[] args) {

        System.out.println("<=====Login=====>");
        System.out.print("username: ");
        username = input.next();

        System.out.print("password: ");
        password = input.next();
        if (username.equals("std") && password.equals("123")){
            System.out.println("You are logged in as student");
        datainfo.stdinfo();}
        else if (username.equals("lib") && password.equals("123")) {
            System.out.println("You are logged in as librarian");
            datainfo.libinfo(); }
        else {
            System.out.println("Login declined, Username or Passwrod is invalid");
            run = false;
        }
        while (run) {
            if (username.equals("std")) {
                isUserstatus();
            }
            System.out.println("\n0. load data. "
                              +"\n1. Save and quit "
                              +"\n2. Show book list "
                              +"\n3. Add book to library"
                              +"\n4. Borrow Book"
                              +"\n5. Return book");
            System.out.print("Pick Menu : ");
            int answer = input.nextInt();
            switch (answer) {
                case 0 -> {
                    System.out.print("Enter file name to load : ");
                    loadScript(input.next());   }
                case 1 -> saveAndQuit();
                case 2 -> System.out.println(lib.toString());
                case 3 -> addBook();
                case 4 -> borrowBook();
                case 5 -> returnbook();
            }   }
        System.exit(0);
    }
    private static void addBook() {
         int isbn;
         String title, author;
         double price;

        System.out.print("\nEnter Title : " );
        title = input.next();
        System.out.print("Enter Author : " );
        author = input.next();
        System.out.print("Enter ISBN : " );
        isbn = input.nextInt();
        System.out.print("Enter Price : " );
        price = input.nextDouble();

        book b = new book(isbn, title, author, price);
        lib.addBook(b); }
    private static void saveAndQuit() {
        System.out.print("Enter filename : ");
        fileName = input.next() +".ser"; //for saving the object
        run = false;
        FileOutputStream fos = null;
        ObjectOutput out = null;
        try {
            fos = new FileOutputStream(fileName); //write the object
            out = new ObjectOutputStream(fos);
            out.writeObject(lib); //lib is the place of object
            fos.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void loadScript(String name) { //this method for load the object
        FileInputStream fis = null;
        ObjectInputStream input = null;
        File file = new File(name +".ser"); //open file
        if (file.exists()) { //knowing that file is exist
            try {
                fis = new FileInputStream(file);
                input = new ObjectInputStream(fis); //data is object
                lib = (library) input.readObject(); //reading object
                fis.close();
                input.close(); //close the program
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace(); }
        }else{
            System.out.println("\nFile not found"); }   }
private static void borrowBook () {
        int booknumber;
        String bookload;
    System.out.print("Choose data to open : ");
    bookload = input.next();
        loadScript(bookload);
    System.out.println(lib.toString());
    System.out.print("Chose book to borrow : ");
    booknumber = input.nextInt();

    switch (booknumber) { //to choose which book you wanna read
        case 1 -> {
            System.out.println("You borrow history");userstatus = false;
        }
        case 2 -> {
            System.out.println("You borrow Math");userstatus = false;
        }
        case 3 -> {
            System.out.println("You borrow physics");userstatus = false;
        }   }
    }
    public static void isUserstatus() {
        if (userstatus == true) {
            System.out.println("Status user : " +userstatus);
            System.out.println("User has not borrow the book");

        }else if (userstatus == false) {
            System.out.println("Status user :" +userstatus);
            System.out.println("User is already borrow book");
        }
    }
    public static boolean returnbook(){
        return userstatus==false;
    }
}

//Java I/O has 3 step -> -Open -Read -Close
