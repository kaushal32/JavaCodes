import java.util.Locale;
import java.util.Scanner;

public class Append {
    String s1;
    String s2;
    Append(){
        Scanner s = new Scanner(System.in);
        s1 = s.next();
        s2 = s.next();
    }

    public static void main(String[] args) {
        c obj = new Append();
        int ls1 = obj.s1.length();
        int ls2 = obj.s2.length();
        String c = Character.toString(obj.s1.charAt(ls1 - 1));
        String s;
        StringBuilder sb = null;
        sb = new StringBuilder(obj.s1);
        if (obj.s1.charAt(ls1 - 1) == obj.s2.charAt(0)) {
            sb.deleteCharAt(ls1 - 1);
        }
        s = sb + obj.s2;
        System.out.println(s.toLowerCase());
    }
