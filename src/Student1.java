import java.util.Scanner;

public class Student1 {
    String name;
    int age;
    String address;

    Student1() {
        name = "unknown";
        age = 0;
        address = "not available";
    }

    public void setInfo(String n1, int a1) {
        System.out.println(n1 );
        System.out.print(a1 );
        System.out.print(address );
    }

    public void setInfo(String n2, int a2, String ad2) {
        System.out.println(n2 );
        System.out.print(a2 );
        System.out.print(ad2 );
    }

    public static void main(String[] args) {
        Student1 obj = new Student1();
        obj.setInfo("Aman", 21);
        obj.setInfo("Naman", 24, "Abc street, xyz City");
        obj.setInfo("Manan", 23);
        obj.setInfo("Harsh", 26);
        obj.setInfo("Kunal", 27);
        obj.setInfo("Annu", 23, "Pqr street, lmn City");
        obj.setInfo("Anni", 29);
        obj.setInfo("kunnu", 24);
        obj.setInfo("Modi", 27);
        obj.setInfo("Pappu", 26);
    }
}
