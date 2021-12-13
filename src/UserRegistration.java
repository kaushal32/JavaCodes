package exceptionHandling;

public class UserRegistration 
{
    String country,name;

    public void registerUser(String name, String country)
    {
        this.name = name;
        this.country = country;
        System.out.println("Name : " + name);
        System.out.println("Country : " + country);
        try
        {
            if (country.equals("India"))
            {
                System.out.println("User is successfully registered.");
            }
            else
            {
                throw new InvalidCountryException();
            }
        }
        catch (InvalidCountryException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class InvalidCountryException extends Exception
{
    @Override
    public String getMessage()
    {
        return "User outside India cannot be registered!";
    }
}
class UserRegistrationMain
{
    public static void main(String[] args)
    {
        UserRegistration obj = new UserRegistration();
        obj.registerUser("Kaushal","India");
        obj.registerUser("Donald Trump","USA");
    }
}
