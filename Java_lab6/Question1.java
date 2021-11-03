/**
 * @author : Raj Karan Singh Chhabra
 */
class Member {
     String name, phoneNumber, address;
     int age;
     double salary;

    public void printSalary() {
        System.out.println("Salary:" + salary);
    }
}

class Employee extends Member {
     String specialization;
     String Department;
}

class Question1 {
    public static void main(String[] args) {
        final long start_time = System.currentTimeMillis();
        Employee employee = new Employee(); 
        employee.name = "Raj Karan Singh";
        employee.age = 21;
        employee.phoneNumber = "555-555-555";
        employee.address = "Home";
        employee.salary = 2665550.35;
        employee.specialization = "IT";
        employee.printSalary();
        final long end_time = System.currentTimeMillis();
        System.out.println("Executed in: "+(end_time-start_time)+" ms");

    }
}
