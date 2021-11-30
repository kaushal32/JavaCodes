import java.util.regex.*;

public class RegularExp {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("kau");
        int count =0;
        String s = "kaushal kau kumar";
        Matcher m = p.matcher(s);
        while (m.find()){
            count++;
            System.out.println(m.start()+" "+m.end());
        }
        System.out.println(count);
    }
}