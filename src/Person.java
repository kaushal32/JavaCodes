public class Person {
    Teacher obj2 = new Teacher(50000.00, "Computer Science");
    Student obj3 = new Student();
    public void m1(){
        System.out.println(obj2.salary);
        System.out.println(obj2.subject);
    }

    public static void main(String[] args) {
        Person obj = new Person();
        obj.m1();
        System.out.println(".........................................");
        System.out.println(obj.obj3.obj1.year);
        System.out.println(obj.obj3.obj1.major);
    }
}
class  Student extends  Person{
    CollegeStudent obj1 = new CollegeStudent(2, "Computer Science Engineering");
}
class Teacher extends  Person{
    double salary;
    String subject;
    Teacher(double sa, String s){
        salary = sa;
        subject = s;
    }
}
class CollegeStudent extends Student{
    int year;
    String major;
    CollegeStudent(int y, String m){
        year = y;
        major = m;
    }
}