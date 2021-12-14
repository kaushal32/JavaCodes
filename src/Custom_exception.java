class VoteException extends RuntimeException{
    public VoteException(String obj)
    {
        super(obj);
    }
}
public class Custom_exception {
    public static void main(String[] args) {
        int age=3;
        try {
            if (age < 18) throw new VoteException("not valid");
        }
        catch (VoteException obj)
        {
            System.out.println(obj);
            System.out.println(obj.toString());

        }

    }
}
