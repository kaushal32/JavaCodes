import java.util.Scanner;

public class Reverse{
    public static void main(String[]...args) {
        if(args.length!=4){
            System.out.println("Please enter 4 integer number");
        }
        else{
            for(int i=0;i<args.length-2;i++){
                for(int j=0;j<args.length-2;j++) {
                    System.out.print(args[i][j]);
                }
                System.out.println();
            }
            for(int i1=0;i1<args.length-2;i1++){
                for(int j1=0;j1<args.length-2;j1++) {
                    System.out.print(args[j1][i1]);
                }
                System.out.println();
            }
        }
    }
}

