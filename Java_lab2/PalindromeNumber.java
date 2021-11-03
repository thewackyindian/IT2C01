/**
 * @author : Raj Karan Singh Chhabra
 */
import java.util.*;
public class PalindromeNumber
{
    public static void main(String[] args) 
    {
        int N, temp, remainder;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an Integer");
        N = s.nextInt();
        temp = N;
        int reverse = 0;
        while (temp != 0) {
            remainder = temp % 10;
            reverse = (reverse * 10) + remainder;
            temp = temp / 10;
        }
        if (reverse == N) {
            // N is palindrome number
            System.out.println(N + " is a Palindrome Number");
        } else {
            // N is not  palindrome number
            System.out.println(N + " is not a Palindrome Number");
        }
        s.close();
    }
}