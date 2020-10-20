import java.awt.*;

class Person{
    public String name;
    public String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Student extends Person{
    public String program;
    public int year;
    public double fee;


    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                '}';
    }
}

class Staff extends Person{
    public String school;
    public double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}
public class TestPerson {
    public static void main(String[] args) {
        Student std2 = new Student("zy", "chengdu","shangxue",10,200000.00);
        System.out.println(std2.getName());
        System.out.println(std2.getAddress());
        std2.setAddress("Tianjin");
        System.out.println(std2.getAddress());
        System.out.println(std2.getProgram());
        std2.setProgram("van");
        System.out.println(std2.getProgram());
        System.out.println(std2.getYear());
        std2.setYear(20);
        System.out.println(std2.getYear());
        System.out.println(std2.getFee());
        std2.setFee(300000.00);
        System.out.println(std2.getFee());
        Staff sta2 = new Staff("ZhuangYan", "China", "UESTC", 2000.00);
        System.out.println(sta2.getSchool());
        sta2.setSchool("UESTC shahe");
        System.out.println(sta2.getSchool());
        System.out.println(sta2.getPay());
        sta2.setPay(3000.00);
        System.out.println(sta2.getPay());
    }
}
