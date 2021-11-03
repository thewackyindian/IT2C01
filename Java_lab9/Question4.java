/**
* author : Raj Karan Singh Chhabra
**/
import java.util.*;
class myCalculator{
    long power(int n, int p) throws Exception{
        if(n<0 || p<0){
             throw new Exception("n and p should be non-negative");
        }
        else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        else {
            return (long)(Math.pow(n,p));
        }
    }
}
class Question4{

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base for computation : ");
        int n = sc.nextInt();
        System.out.print("Enter the exponent for computation : ");
        int p = sc.nextInt();
        myCalculator M = new myCalculator();
        try
        {
            System.out.println(M.power(n,p));
        }
        catch(Exception except)
        {
                System.out.println(except);
        }
        sc.close();

    }
}