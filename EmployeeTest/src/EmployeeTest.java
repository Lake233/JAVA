import java.io.*;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("Tom");
        Employee empTWO = new Employee("Jerry");

        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTWO.empAge(21);
        empTWO.empDesignation("菜鸟程序员");
        empTWO.empSalary(500);
        empTWO.printEmployee();
    }
}
