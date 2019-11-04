import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setAuthor("Kathy Sierra");
        book1.setBookTitle("Head First Java");
        book1.setDescription("Easy to read Java workbook");
        book1.setPrice(47.50);
        book1.setSKU("Java1001");


        Book book2 = new Book();
        book2.setAuthor("Bruce Eckel");
        book2.setBookTitle("Thinking in Java");
        book2.setDescription("Details about Java under the hood");
        book2.setPrice(20.00);
        book2.setSKU("Java1002");

        Book book3 = new Book();
        book3.setAuthor("Jeanne Boyarsky");
        book3.setBookTitle("OCP: Oracle Certified Professional Java SE");
        book3.setDescription("Everything you need to know in one place");
        book3.setPrice(45.00);
        book3.setSKU("Orcl1003");

        Book book4 = new Book();
        book4.setAuthor("Al Sweigart");
        book4.setBookTitle("Automate the Boring Stuff with Python");
        book4.setDescription("Fun with Python");
        book4.setPrice(10.50);
        book4.setSKU("Python1004");

        Book book5 = new Book();
        book5.setAuthor("Simon Monk");
        book5.setBookTitle("The Maker's Guide to the Zombie Apocalypse");
        book5.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi\t");
        book5.setPrice(16.50);
        book5.setSKU("Zombie1005");

        Book book6 = new Book();
        book6.setAuthor("Donald Norris");
        book6.setBookTitle("Raspberry Pi Projects for the Evil Genius");
        book6.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
        book6.setPrice(14.75);
        book6.setSKU("Rasp1006");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        skuCheck(books);

    }



    public static void skuCheck(ArrayList<Book> books){

        System.out.println("please enter SKU number to find book details: ");
        String check = keyboard.next();
        for(Book b : books){
            if(b.getSKU().equalsIgnoreCase(check)){
                System.out.println("title : " + b.getBookTitle());
                System.out.println("Author : " + b.getAuthor());
                System.out.println("Description: " + b.getDescription());
                System.out.println("Price: " + b.getPrice());
            }

        }
    }
}
