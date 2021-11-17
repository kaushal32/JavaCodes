public class Fruit {
    String name;
    String taste;
    int size;
    public void eat(String n,String t){
        n=name;
        t=taste;
        // comment

    }

    public static void main(String[] args) {
        Apple obj1 = new Apple();
        Orange obj2 = new Orange();
        obj1.eat("Apple","Sweet");
        obj2.eat("Orange","Juicy");
    }
}
class Apple extends Fruit{
    @Override
    public void eat(String n, String t){
        n="Apple";
        System.out.println(n+" "+t);
    }

}
class Orange extends Fruit{
    @Override
    public void eat(String n,String t){
        n="Orange";
        System.out.println(n+" "+t);
    }

}