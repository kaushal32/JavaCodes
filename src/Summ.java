import java.util.Scanner;

public class Summ {
    int arr[];

    Summ() {
        arr = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
    }

    public static void main(String[] args) {
        Summ obj = new Summ();
        int s=0;
        for (int j = 0; j < obj.arr.length; j++) {
            s=s+obj.arr[j];
            for (int k = j; k < obj.arr.length; k++) {
                if (obj.arr[j] == 6){
                    if(obj.arr[k]==7){
                        for(int l = j;l<=k;l++){
                            s=s-obj.arr[l];
                        }
                    }
                }
            }
        }
        System.out.println(s);
    }
}
