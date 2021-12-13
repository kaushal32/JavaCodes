package exceptionHandling;

public class AddAverage
{
    int[] arr = new int[5];
    int sum = 0,avg;
    public void avg()
    {
        for (int j : arr) {
            sum += j;
        }
        try
        {
            avg = sum/arr.length;
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + avg);
        }
    }
}

class AddAvgMain
{
    public static void main(String[] args)
    {
        AddAverage obj = new AddAverage();
        for (int i = 0; i < obj.arr.length; i++)
        {
            try
            {
                obj.arr[i] = Integer.parseInt(args[i]);
            }
            catch (NumberFormatException n)
            {
                System.out.println("n.printStackTrace()");
            }
        }
        obj.avg();
    }
}
