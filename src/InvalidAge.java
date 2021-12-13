package exceptionHandling;

import java.util.Scanner;

public class InvalidAge
{
    public static void main(String[] args)
    {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        name = sc.nextLine();
        System.out.print("Age : ");
        try
        {
            age = sc.nextInt();
            if (age >= 18 && age < 60)
            {
                System.out.println("Entered age is valid.");
            }
            else
            {
                throw new InvalidAgeException();
            }
        }
        catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class InvalidAgeException extends Exception
{
    @Override
    public String getMessage()
    {
        return "Person's age must be in the range of 18-60.";
    }
}
