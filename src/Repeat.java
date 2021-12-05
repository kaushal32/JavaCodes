import java.util.Scanner;

public class Repeat {
    String s;
    int n;
    Repeat(){
        Scanner ss = new Scanner(System.in);
        s= ss.next();
        n=ss.nextInt();
    }

    public static void main(String[] args) {
        Repeat obj = new Repeat();
        int ls1 = obj.s.length();
        String s1 = obj.s.substring(ls1-obj.n,ls1);
        String s2 ="";
        for(int i=0;i<obj.n;i++){
            s2+= s1;
        }
        System.out.println(s2);
    }
}
