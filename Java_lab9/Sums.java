/**
* author : Raj Karan Singh Chhabra
* Question3 Solution
**/
/* Solution */
import java.io.*;
public class Sums {
    public static void sum(BufferedReader in) {
        int s, nextInt;
        s = 0;nextInt = 1;
        System.out.println("Please input the sequence of integers to sum, terminated by a 0");
        while(nextInt!=0) {
            try{
                nextInt = Integer.parseInt(in.readLine());
                //Read next datum in input. An integer is expected
                s = s + nextInt;
            } 
            catch (NumberFormatException except) {
                System.out.println("Invalid number. Please reenter.");
            } 
            catch (IOException except) {
                System.out.println("Invalid number. Please reenter.");
            }
        }
        System.out.println("The sum is " + s);
    }

    public static void main(String[] arg) {    
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //"in" will receive data from the standard input stream
        String c;
        boolean moreSums = true;
        System.out.println("Do you wish to calculate a sum? (y/n)");
        while (moreSums) {
            try{
                c = in.readLine(); 
                //Read next datum in input. A string "y" or "n" is expected
                while (!c.equals("y") && !c.equals("n")) {
                    System.out.println("Please input y or n");
                    c = in.readLine();
                }

                if (c.equals("y")) {
                    sum(in);
                    System.out.println("Do you wish to calculate another sum? (y/n)");
                } 
                else {
                     moreSums = false;
                }
            } 
            catch (IOException except) {
                System.out.println("Input error occurred. Please reenter.");
            }
        }
        System.out.println("Goodbye");
    }
}
	