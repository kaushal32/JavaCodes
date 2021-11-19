import java.util.Scanner;

public class Chars {
    String s;
    Chars(){
        Scanner ss = new Scanner(System.in);
        s= ss.next();
    }

    public static void main(String[] args) {
        Chars obj = new Chars();
        int ls1 = obj.s.length();
        String s1 = obj.s.substring(0,2);
        String s2="";
        for (int i=0; i<ls1;i++){
            s2 = s2+s1;
        }
        System.out.println(s2);
    }
