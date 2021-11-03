/**
 * @author : Raj Karan Singh Chhabra
 */
public class Student
{
    Student(){
        System.out.println("Name of student is: "+"Unknown");
    }
    Student(String s){
        System.out.println("Name of student is: "+s);
    }
    public static void main(String[] args) 
    {
        Student obj1=new Student();
        Student obj2=new Student("Raj Karan Singh");
    }
}