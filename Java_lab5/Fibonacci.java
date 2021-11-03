/**
 * @author : Raj Karan Singh Chhabra
 */
import java.util.*;
public class Fibonacci {
    int max = 1000000;
    int[] fib = new int[max];

    public int fibonacci(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        if (fib[num] != 0) {
            return fib[num];    
        }
        fib[num] = fibonacci(num - 1) + fibonacci(num - 2);  
        return fib[num];
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int  n;
        System.out.print("Enter the length of sequence: \n");
        n = sc.nextInt();
        System.out.print("Fibonacci Sequence: \n");
        Fibonacci obj = new Fibonacci();
        for(int i =0;i < n;i++){
            System.out.print(obj.fibonacci(i)+" ");   
        }
        System.out.println();
        
        sc.close();
       
    }
}