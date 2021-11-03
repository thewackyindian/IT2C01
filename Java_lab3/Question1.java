/**
 * @author : Raj Karan Singh Chhabra
 */

public class Question1
{
    static boolean isPrime(int lg)
    {
        int  lastn;
        double a;
        boolean flag;
        a = Math.sqrt(lg);
        lastn = (int)a;
        flag = true;
        for (int i =2; i<lastn; i++)
        {
            if( lg % i == 0)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) 
    {
        int count = 0;
        while(true){
            count++;
            if(isPrime(count)){
                System.out.println(count+" It is a prime instance");
            }
        }
    }
}