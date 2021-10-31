package exceptionHandling;

import java.util.Scanner;

public class Result
{
    int[] m1,m2;
    String name1,name2;

    Scanner sc = new Scanner(System.in);
    Result()
    {
        m1 = new int[3];
        m2 = new int[3];
    }
    public void enter(int[] a)
    {
        System.out.println("Enter marks of student in 3 subjects : ");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print("Subject " + (i+1) + " : ");
            try
            {
                a[i] = Integer.parseInt(sc.next());
                if (a[i] < 0)
                {
                    throw new NegativeValueException();
                }
                else if (a[i] > 100)
                {
                    throw new ValueOutOfRange();
                }
            }
            catch (NumberFormatException n )
            {
                System.out.println("Please enter integer value!!");
                System.exit(0);
            }
            catch (ValueOutOfRange e)
            {
                System.out.println(e.getMessage());
                System.exit(0);
            }
            catch (NegativeValueException e)
            {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
    }
    public void avg(int[] marks)
    {
        int sum = 0,avg;
        for (int mark : marks)
        {
            sum += mark;
        }
        avg = sum/marks.length;
        System.out.println("Average = " + avg);
    }
}
class NegativeValueException extends Exception
{
    @Override
    public String getMessage()
    {
        return "You can't enter negative values!!";
    }
}
class ValueOutOfRange extends Exception
{
    @Override
    public String getMessage()
    {
        return "Enter value between 0 & 100!!";
    }
}

class ResultMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Result obj = new Result();
        System.out.print("Enter name of first student : ");
        obj.name1 = sc.nextLine();
        obj.enter(obj.m1);
        obj.avg(obj.m1);
        System.out.print("Enter name of second student : ");
        obj.name2 = sc.nextLine();
        obj.enter(obj.m2);
        obj.avg(obj.m2);
    }
}
