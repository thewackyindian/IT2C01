
/**
 * @author : Raj Karan Singh Chhabra
 */
import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                sum += (i + n / i);
            }
        }
        if (sqrt * sqrt == n) {
            sum -= sqrt;
        }
        return sum;
    }
}

class Question2 {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    /**
     * getClass() returns the class that the object belong to.
     * getInterfaces() returns an interface array that are implemented in the class.
     * So o.getClass().getInterfaces() means get the array of interfaces which are implemented in the class that is o's data type.  
     */
    static void ImplementedInterfaceNames(Object o) {
        Class<?> [] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}