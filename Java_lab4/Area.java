/**
 * @author : Raj Karan Singh Chhabra
 */
import java.util.*;
public class Area
{
    static void area(float length , float breadth){
        double area = length*breadth;
        System.out.println("Area of reactangle :"+area);
    }
    static void area(float side ){
        double area = side*side;
        System.out.println("Area of square :"+area);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        float length , breadth , side;
        System.out.println("Enter the length and breadth for rectangle ");
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        area(length,breadth);
        System.out.println("Enter the side for square ");
        side = sc.nextFloat();
        area(side);
        sc.close();

       
    }
}