/**
 * @author : Raj Karan Singh Chhabra
 */
import java.util.*;
class Student {
    int snum;
    String sname,deg;

    public void getStud(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student number : ");
        snum = sc.nextInt();
        System.out.print("Enter Student name : ");
        sname = sc.nextLine();
        sname = sc.nextLine();
        System.out.print("Enter Student Degree : ");
        deg = sc.nextLine();
        sc.close();
    }

    public void showstud(){
        System.out.println("Student number : "+snum);
        System.out.println("Student name : "+sname);
        System.out.println("Student Degree : "+deg);
    }
}

class Marks extends Student{
    double m1, m2, m3;

    public void getmark(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for first subject: ");
        m1 = sc.nextDouble();
        System.out.print("Enter marks for second subject: ");
        m2 = sc.nextDouble();
        System.out.print("Enter marks for third subject:  ");
        m3 = sc.nextDouble();
        sc.close();
    }
    public void showmark(){
        System.out.println("Marks for first subject:  " +m1);
        System.out.println("Marks for second subject:  " +m2);
        System.out.println("Marks for third subject:  " +m3);
    }
}

class Result extends Marks {
    double total;   
    double avg;
    char grade;

    public void Calresult(){
        total = m1+m2+m3;
        avg = total/3;
        System.out.println("Average marks is : "+avg);
    }

    public void CalGrade(){
        if(avg >= 60 && avg <= 100)
            grade = 'A';
        else if (avg >= 40 && avg <= 59)
            grade = 'B';
        else
            grade = 'C';
        System.out.println("Grade assigned is : "+grade);
    }

    public void Showresult(){
        System.out.println("Averege marks is "+avg);
        System.out.println("Total marks is : "+total);
        System.out.println("Grade assigned is : "+grade);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Result result = new Result();
        result.getStud();
        result.getmark();
        result.showstud();
        result.Calresult();
        result.CalGrade();
        result.Showresult();
    }
}
