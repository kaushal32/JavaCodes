public class Student {
    String s;
    Student(){
        s="Unknown";
    }
    Student(String s){
        this.s=s;
    }

    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student("Snigdha");
        System.out.println(obj.s);
        System.out.println(obj1.s);

    }
}
