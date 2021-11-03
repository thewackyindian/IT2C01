/**
 * @author : Raj Karan Singh Chhabra
 */
import java.util.*;

public class DuplicatesRemoval
{
   	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String arr[]= new String[10];
        System.out.println("Enter 10 strings of max-characters  or length  <= 10");
        for(int i=0; i<10;i++){
           arr[i] = sc.next();
        }
        int count = 0;
        String distinct[]= new String[10];
        for(int i=0; i<10;i++){
            distinct[i] = "";
        }
        boolean check[] = new boolean[10];
        for(int i=0; i<10;i++){
           check[i] = true;
        }
        for (int i = 0; i < 10;i++){
            if(check[i]){
                distinct[count++]=arr[i];
                for (int j = i + 1; j < 10 ; j++){
                    if(arr[i].equals(arr[j])){
                        check[j] =false;
                    }
                }
            } 
        }
         System.out.print("Distinct strings are :");
        for(int i= 0;i<10;i++){
            if(distinct[i].isEmpty()){
                break;
            }
            System.out.print(distinct[i]+" ");
        }
        sc.close();
    }
}