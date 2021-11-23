import java.util.Scanner;

public class Bigger {
    String a;
    String b;
    Bigger(){
        Scanner s = new Scanner(System.in);
        a= s.next();
        b=s.next();
    }

    public static void main(String[] args) {
        Bigger obj = new Bigger();
        int ls1 = obj.a.length();
        int ls2 = obj.b.length();
        String s="";
        if(ls1<=ls2){
            for(int j=0;j<ls1;j++){
                s+= Character.toString(obj.a.charAt(j));
                s+= Character.toString(obj.b.charAt(j));
            }
            for(int i=ls1;i<ls2;i++ ){
                s+= Character.toString(obj.b.charAt(i));
            }
        }
        else {
            for(int j=0;j<ls2;j++){
                s+= Character.toString(obj.a.charAt(j));
                s+= Character.toString(obj.b.charAt(j));
            }
            for(int i=ls2;i<ls1;i++ ){
                s+= Character.toString(obj.a.charAt(i));
            }
        }
        System.out.println(s);
    }
}