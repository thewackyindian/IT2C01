/**
* Java Program to Take three numbers x,y,z as input. 
* Find the largest among three numbers x, y, and z.
* You should use if-then-else construct in Java.
* 
* @author : Raj Karan Singh Chhabra
*/
import java.util.*;
public class Max_number
{
	public static void main (String[] args) 
	{
		int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        a= s.nextInt();
        System.out.print("Enter the second number:");
        b= s.nextInt();
        System.out.print("Enter the third number: ");
        c= s.nextInt();
     
        if(a>= b&& a>= c)
        {
            /*conditiom to check a is bigger than the other two */
            System.out.println("Largest number is: "+a);
        }
        else if(b>= c&& b>= a)
        {
            /*conditiom to check b is bigger than the other two */
            System.out.println("Largest number is: "+b);
        }
        else
        {
            /*else C is the largest*/
            System.out.println("Largest number is: " + c);
        }
        s.close();
	}
}
