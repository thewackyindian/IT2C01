/**
 * @author : Raj Karan Singh Chhabra
 */
import java.util.*;
class Student{
    String name;
    int rollNumber;
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        name = sc.nextLine();
        System.out.print("Enter the student roll number: ");
        rollNumber = sc.nextInt();
        sc.close();
    }
    public void display(){
        System.out.println("Student Name is :" + name);
        System.out.println("Student Roll Number is :" + rollNumber);
    }
}
class Exam extends Student{
    int phy_marks,math_marks;
    public void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the physics marks: ");
        phy_marks = sc.nextInt();
        System.out.print("Enter the maths marks: ");
        math_marks = sc.nextInt();
        sc.close();
        
    }
    public void display(){
        super.display();
        System.out.println("Physics Marks is :" + phy_marks);
        System.out.println("Maths marks is :" + math_marks);
    }
}
class Result extends Exam{
    public void display(){
        super.read();
        super.display();
        System.out.println("Percentage is :" + ((super.phy_marks+super.math_marks)/2) +"%");
    }
}

public class Question3
{
    public static void main(String[] args) {
        Result result = new Result();
        result.display();
    }
   
}
