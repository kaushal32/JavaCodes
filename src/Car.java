public class Car {
    String manufacturer;
    int price;
    Car(String manufacturer,int price){
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public static void main(String[] args) {
        Car obj1 = new Car("Tesla", 2500000);
        Car obj2 = new Car("Tata", 400000);
        Car obj3 = new Car("Maruti", 300000);
        if (obj1.price > obj2.price) {
            if (obj2.price > obj3.price) {
                System.out.println(obj1.price + " " + obj1.manufacturer);
                System.out.println(obj2.price + " " + obj2.manufacturer);
                System.out.println(obj3.price + " " + obj3.manufacturer);
            } else if (obj3.price > obj1.price) {
                System.out.println(obj3.price + " " + obj3.manufacturer);
                System.out.println(obj1.price + " " + obj1.manufacturer);
                System.out.println(obj2.price + " " + obj2.manufacturer);
            }

        }
        else if(obj2.price>obj1.price){
            if(obj1.price>obj3.price){
                System.out.println(obj2.price+" "+obj2.manufacturer);
                System.out.println(obj1.price+" "+obj1.manufacturer);
                System.out.println(obj3.price+" "+obj3.manufacturer);
            }
            else if(obj3.price> obj2.price){
                System.out.println(obj3.price+" "+obj3.manufacturer);
                System.out.println(obj2.price+" "+obj2.manufacturer);
                System.out.println(obj1.price+" "+obj1.manufacturer);
            }
        }
        else{
            if(obj1.price>obj3.price){
                System.out.println(obj1.price+" "+obj1.manufacturer);
                System.out.println(obj3.price+" "+obj3.manufacturer);
                System.out.println(obj2.price+" "+obj2.manufacturer);
            }
            else{
                System.out.println(obj3.price+" "+obj3.manufacturer);
                System.out.println(obj2.price+" "+obj2.manufacturer);
                System.out.println(obj1.price+" "+obj1.manufacturer);
            }
        }
    }