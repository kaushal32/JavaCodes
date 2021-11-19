public class Display {
    public static void main(String[] args) {
        Check obj = new Check("No.of objects",+1);
        System.out.println(obj.i);
    }

}
class Check{
    String s;
    int i;
    Check(String s, int j){
        this.s = s;
        i=j;
    }
    Check obj1 = new Check("Object 1",+1);
    Check obj2 = new Check("Object 2",+1);
    Check obj3 = new Check("Object 3",+1);
    Check obj4 = new Check("Object 4",+1);

}