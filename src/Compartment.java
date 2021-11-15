import java.util.Scanner;

public abstract class Compartment {
    public abstract String notice();
}
class FirstClass extends Compartment{

    @Override
    public String notice() {
        String s = "First Class compartment";
        return s;
    }
}
class Ladies extends Compartment{

    @Override
    public String notice() {
        String s1 = "Ladies Compartment";
        return s1;
    }
}
class General extends Compartment{

    @Override
    public String notice() {
        String s2 = "General Compartment";
        return s2;
    }
}
class Luggage extends Compartment{

    @Override
    public String notice() {
        String s3 = "Luggage Compartment";
        return s3;
    }
}
class TestCompartment{

    public static void main(String[] args) {
        Compartment obj = new Compartment() {
            @Override
            public String notice() {
                int arr[] = new int[10];
                return null;
            }
        };
        Scanner ss = new Scanner(System.in);
        int val = ss.nextInt();
        if(val==1){
            FirstClass obj1 = new FirstClass();
            System.out.println(obj1.notice());
        }
        else if(val==2){
            Ladies obj2 = new Ladies();
            System.out.println(obj2.notice());
        }
        else if(val==3){
            General obj3 = new General();
            System.out.println(obj3.notice());
        }
        else if(val==4){
            Luggage obj4 = new Luggage();
            System.out.println(obj4.notice());
        }
    }
}