/**
 * @author : Raj Karan Singh Chhabra
 */
import java.util.*;
public class Student_two
{
    String name;
    int age;
    String address;

    Student_two(){
        name="unknown";
        age=0;
        address="not available";
    }
    void setInfo(String name , int age , String address){
        this.name = name;
        this.age =age;
        this.address = address;
        display();
    }
    void setInfo(String name , int age ){
        this.name = name;
        this.age =age;
        this.address="not available";
        display();
    }
    public void display() {
        System.out.println("Name of student : " + this.name);
        System.out.println("Age of student : " + this.age);
        System.out.println("Address of student : " + this.address);
        System.out.println("__\n");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        Student_two obj1=new Student_two();
        Student_two obj2=new Student_two();
        Student_two obj3=new Student_two();
        Student_two obj4=new Student_two();
        Student_two obj5=new Student_two();
        obj1.setInfo("Raj Karan Singh ", 21);
        obj2.setInfo("thewackyindian", 20);
        obj3.display();
        obj4.setInfo("Arduous", 29, "Lajpat Nagar,Barabanki");
        obj5.setInfo("Dobby", 25, "Civil Lines, BBk");
        sc.close();
    }
}