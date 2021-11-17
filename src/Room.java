import java.util.Scanner;

public class Room {
    boolean AC_ON;
    boolean HOME_THEATRE_ON;
    boolean FAN_ON;
    boolean LIGHT_ON;
    int power=0;
    Room(boolean ac, boolean theatre, boolean fan, boolean light){
        AC_ON = ac;
        HOME_THEATRE_ON =theatre;
        FAN_ON = fan;
        LIGHT_ON = light;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Room obj = new Room(s.nextBoolean(),s.nextBoolean(),s.nextBoolean(),s.nextBoolean());
        int power = obj.power;
        if(obj.AC_ON == true){
            power = power + 1200;
            System.out.println("AC is ON");
        }
        else{
            System.out.println("AC is OFF");
        }
        if(obj.HOME_THEATRE_ON == true){
            power = power + 600;
            System.out.println("Theatre is ON");
        }
        else{
            System.out.println("Theatre is OFF");
        }
        if(obj.FAN_ON == true){
            power = power + 400;
            System.out.println("FAN is ON");
        }
        else{
            System.out.println("FAN is OFF");
        }
        if(obj.LIGHT_ON == true){
            power = power + 100;
            System.out.println("Light is ON");
        }
        else{
            System.out.println("Light is OFF");
        }
        if(power>2000){
            System.out.println("Overload");
        }

    }
}
