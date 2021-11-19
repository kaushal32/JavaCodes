public class Testt {
    int arr[];
    public boolean search(int[] arr, int search_element){
        int c=0;
        for(int i=0;i<5;i++){
            if(arr[i]==search_element) {
                c = c + 1;
            }
        }
        if(c==0){
            System.out.println("element not found");
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        Testt obj = new Testt();
        System.out.println(obj.search(new int[]{10, 20, 30, 40, 50}, 10));
    }
}