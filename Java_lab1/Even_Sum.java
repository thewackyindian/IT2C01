/**
* Java Program to take a number n as input. 
* Calculate the sum of all even numbers starting from zero(0)
* and less than n which are divisible by 3 . Print the sum.
* 
 * @author : Raj Karan Singh Chhabra
*/
import java.util.*;
public class Even_Sum
{
	public static void main (String[] args) 
	{
		// your code goes here
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        n = s.nextInt();
        int sum = 0;
        for (int i = 0;i < n; i++){
            /*
            Condition to check the divisbility of number by 3 and  divisibility by 2 (indeed even number)
            */
            if( i%3 == 0 && i%2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("Required Sum is : " + sum);
        s.close();
	}
}
