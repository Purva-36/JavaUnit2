package Unit2;
class StudentPCU
{
    String name;
    int roll;
    String prn;
    String dob;
    String bg;
    char   gen;

    public StudentPCU(String name, int roll, String prn, String dob, String bg, char gen, String specail) {
        this.name = name;
        this.roll = roll;
        this.prn = prn;
        this.dob = dob;
        this.bg = bg;
        this.gen = gen;
        this.specail = specail;

    }
    String specail;

    public StudentPCU() {
        System.out.println("default constructor");
    }

    void register(){

    }
    void cgpa(){

    }
}

public class MyStudent {
    public static <studentPCU> void main(String[] args) {
        System.out.println();
        StudentPCU studentPCU = new StudentPCU();
        System.out.println("Welcome");
        studentPCU.name = "GOGO";
        studentPCU.roll = 1;
        studentPCU.prn = "SOE23201010457";
        studentPCU.bg = "A+ve";
        studentPCU.gen = 'M';
        System.out.println("Name" +studentPCU.name+ "Gender" +studentPCU.gen);
    }
}
