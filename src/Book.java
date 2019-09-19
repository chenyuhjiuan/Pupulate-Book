import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    public static void main(String args[]) {
        ArrayList<BookDB> books= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        BookDB book1=new BookDB();

        while (true) {
            System.out.printf("Please key in the SKU code or type stop to quit.");

            input= scanner.nextLine();
            if(input.equalsIgnoreCase("java1001")) {
                book1 = new BookDB("Java1001", "Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50);
            }
            if(input.equalsIgnoreCase("java1002")) {
                book1 = new BookDB("Java1002", "Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00);
            }
            if(input.equalsIgnoreCase("Orcl1003")) {
                book1 = new BookDB("Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 20.00);
            }
            if(input.equalsIgnoreCase("Python1004")) {
                book1 = new BookDB("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50);
            }
            if(input.equalsIgnoreCase("Zombie1005")) {
                book1 = new BookDB("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 14.50);
            }
            if(input.equalsIgnoreCase("Rasp1006")) {
                 book1 = new BookDB("Rasp1006","Raspberry Pi Projects for the Evil Genius","Donald Norris","A dozen fiendishly fun projects for the Raspberry Pi!",16.50);
            }

            if(input.equalsIgnoreCase("stop")) {
                break;
            }

            books.add(book1);

        }
        System.out.println("Your search result is:");
        for(BookDB book:books)
            System.out.println(book);
    }
}