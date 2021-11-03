/**
 * @author : Raj Karan Singh Chhabra
 */
import java.util.*;
public class TowerofHanoi {
    static void towerOfHanoi(int n, String from_rod, String to_rod, String helper_rod)
    {
        if (n == 1)
        {
            System.out.println("Take disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
        //Move top n-1 disks from first_pole to second_pole using third_pole as middle
        towerOfHanoi(n-1, from_rod, helper_rod, to_rod);
        //Move last disk from first_pole to third_pole
        System.out.println("Take disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        //Move n-1 disks from second_pole to third_pole using first_pole as middle
        towerOfHanoi(n-1, helper_rod, to_rod, from_rod);
    }
 
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int  n;
        System.out.print("Enter the number of discs: \n");
        n = sc.nextInt();
        towerOfHanoi(n, "first_pole", "third_pole", "second_pole");
        sc.close();
    }
 
}