public class Programming {
    String s;
    Programming(){
        System.out.println("I Love Programming Languages");
    }
    Programming(String s){
        this.s = s;
        System.out.print("I Love "+s);
    }

    public static void main(String[] args) {
        Programming obj = new Programming();
        Programming obj1 = new Programming("Java");
    }
}