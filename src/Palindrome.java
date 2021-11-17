import java.util.Scanner;

public class Palindrome {
    String s;
    Palindrome(){
        Scanner ss= new Scanner(System.in);
        s= ss.next();
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        char c;
        String s1 = "";
        int l = obj.s.length();
        for(int i=l-1;i>=0;i--){
            c=obj.s.charAt(i);
            s1 += Character.toString(c);
        }
        if(obj.s.equals(s1)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}