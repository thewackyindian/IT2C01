/**
 * Java Program to check whether an input number is an Armstrong number or not.
 * Armstrong number is a number that is equal to the sum of cubes of its digits.
 * 
 * @author : Raj Karan Singh Chhabra
 */
import java.util.*;
public class ArmstrongNumber
{
    public static void main(String[] args) 
    {
        int N, temp, sum = 0, remainder;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an Integer");
        N = s.nextInt();
        temp = N;

        s.close();
        /*
         * We will find the sum of cubes of every digit of N
         */
        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + (remainder * remainder * remainder);
            temp = temp / 10;
        }
        /*
         * Check if sum is equal to N, then N is a armstrong number otherwise
         * not an armstrong number
         */
        if (sum == N) {
            // N is armstrong number
            System.out.println(N + " is an Armstrong Number");
        } else {
            // N is not an armstrong number
            System.out.println(N + " is not an Armstrong Number");
        }
    }
}