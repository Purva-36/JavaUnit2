package Unit2;

public class Unit2 {
    public static void main(String[] args) {
        System.out.println("Main");
        Student student = new Student();
        student.rollno=1;
        student.gen='M';
        student.name="GOGO";
        student.weight=22.60f;
        student.phone="9876543210";
        student.dob="10-08-1999";
        System.out.println("Student " +student.name);
        student.register();
        student.courseregi();
    }
}
class Student {
    String name;
    char gen;
    String dob;
    String phone;
    int rollno;
    float weight;
    void register() {
        System.out.println("Registered");
    }
    void courseregi()
    {
        System.out.println("Registered");
    }
}