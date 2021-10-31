public class Asciii {
    int arr[];
    Asciii(){
        arr = new int[]{83,78,73,71,68,72,65};
    }

    public static void main(String[] args) {
        Asciii obj = new Asciii();
        char arr1[] = new char[obj.arr.length];
        for(int i =0;i<obj.arr.length;i++){
            arr1[i] = (char)obj.arr[i];
            System.out.print(arr1[i]);
        }
    }
}
