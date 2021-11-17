import java.util.Scanner;

public class Calculator {
    public static int powerInt(int num1,int num2){
        int s=1;
        for (int i =1 ; i<=num2;i++){
            s=s*num1;
        }
        return s;
    }
    public static double powerDouble(double num1, int num2){
        double s1 = 1.00;
        for (int i =1 ; i<=num2;i++){
            s1=s1*num1;
        }
        return s1;
    }

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        Calculator obj = new Calculator();
        System.out.println(obj.powerInt(ss.nextInt(), ss.nextInt()));
        System.out.println(obj.powerDouble(ss.nextDouble(), ss.nextInt()));

    }
}
