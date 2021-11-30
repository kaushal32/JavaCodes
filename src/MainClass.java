public class MainClass {
    public static void main(String[] args) {
        Personn p1 = new Personn();
        p1.age = 24;
        p1.name = "Anuj";

        Personn p2 = new Personn();
        p2.age = 31;
        p2.name = "Aman";

        //System.out.println(p1.age + " " + p1.name);
        //System.out.println(p2.age + " " + p2.name);

        p1.eat();
        p2.walk();
        p2.walk(5);

        System.out.println(Personn.count);

    }
}

class Personn{
    String name;
    int age;

    static int count;

    public Personn(){
        count++;
        System.out.println("creating an object");
    }



    void walk() {
        System.out.println(name + " is walking");

    }
    void eat(){
        System.out.println(name + " is eating");
    }
    void walk(int steps){
        System.out.println(name + " walked " + steps +" steps");
    }
}
