public class AddAmount {
    int amount =50;
    AddAmount(){
        super();
    }
    AddAmount(int a){
        amount = a+50;
    }

    public static void main(String[] args) {
        AddAmount obj = new AddAmount(20);
        System.out.println(obj.amount);
    }
}




