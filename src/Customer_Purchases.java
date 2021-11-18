import java.util.Scanner;

public class Customer_Purchases {
    private int number;
    private String first_name;
    private String surname;
    private String product;
    private double price;
    private int quantity;
    Customer_Purchases(){
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        first_name = s.next();
        surname = s.next();
        product = s.next();
        price = s.nextDouble();
        quantity = s.nextInt();
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        first_name = getFirst_name();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        surname = getSurname();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        product = getProduct();
    }
    public double getPrice() {
        return price;
    }
    public double setPrice(double price) {

        price = this.price;
        return price;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        quantity = getQuantity();
    }
}
class Printing{
    Customer_Purchases obj1 = new Customer_Purchases();
    public void printDetails(){
        System.out.println("Price :: "+obj1.getPrice());
        System.out.println("Number :: "+obj1.getNumber());
        System.out.println("First Name :: "+obj1.getFirst_name());
        System.out.println("Surname :: "+obj1.getSurname());
        System.out.println("Product Name :: "+obj1.getProduct());
        System.out.println("Quantity :: "+obj1.getQuantity());
    }
    public void customerPurchase_Report(){
        //report option %
        //tax 15%
        //commission 8.5%
        //discount 10%
        //total (price + tax) - (discount + commission)
        double tax = obj1.getPrice()*(double)15/100;
        double commission = obj1.getPrice()*(double) 85/1000;
        double discount = obj1.getPrice()*(double)1/10;
        double total = (obj1.getPrice() + tax) - (discount + commission);
        System.out.println("REPORT OPTION PERCENTAGE ::");
        System.out.println("Tax :: "+tax);
        System.out.println("Commission :: "+commission);
        System.out.println("Discount :: "+discount);
        System.out.println("Total Price :: "+total);
    }
    public static void main(String[] args) {
        //capture all customer purchase details req. to produce reports
        Printing p = new Printing();
        p.printDetails();
        p.customerPurchase_Report();
    }