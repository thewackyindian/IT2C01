/**
 * @author : Raj Karan Singh Chhabra
 */
import java.util.*;
public class Intandchar
{
    static void char_int(int integer, char character){
       System.out.println("first argument is integer :"+integer);
        System.out.println("second argument is character :"+character);
    }
    static void char_int(char character, int integer){
        System.out.println("first argument is character :"+character);
        System.out.println("second argument is integer :"+integer);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int integer = 0;
        char character ;
        System.out.println("Enter the required integer ");
        integer = sc.nextInt();
        System.out.println("Enter the required character ");
        character = sc.next().charAt(0);
        
        char_int(integer,character);
        System.out.println();
        char_int(character, integer);
        sc.close();
    }
}