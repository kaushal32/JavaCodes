import java.util.Scanner;

public class Book{
    String name;
    String author;
    double price;
    int qtyIntStock;

    public Book(String the_cantreville_ghost, String valueof, double p, int q) {
        name = the_cantreville_ghost;
        author =  valueof;
        price  =p;
        qtyIntStock =q;
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyIntStock() {
        return qtyIntStock;
    }

    public static void main(String[] args) {
        Book obj = new Book("Gulliver Travells", "Jonathan Swift", 100.00, 1);
        System.out.println("name: "+obj.name);
        System.out.println("author: "+obj.author);
        System.out.println("price: rs."+obj.price);
        System.out.println("quantity: "+obj.qtyIntStock);
    }
}
class Author {


}
