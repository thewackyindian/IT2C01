/**
* author : Raj Karan Singh Chhabra
**/
import java.util.*;

class ThreadA extends Thread {
    public void run() {
        Random random = new Random();
        /** making sure that once the space is created due to the concurrent pop operation,
          * pushing the same number which
          * failed to be pushed earlier because the stack was full. */
        while (true) {
            if (Question2.size < 20) {
                 /*for pushing random numbers between 0 and 100 into the stack.*/
                int x = random.nextInt(101);
                Question2.stack.push(x);
                Question2.size = Question2.size + 1;
                System.out.println("Pushed " + x + ". Size = " + Question2.size);
            } else {
                /**
                 * If the stack becomes full while performing push(),
                 * that is , an overflow condition .
                 */
                System.out.println("Cannot push. Limit reached.");
            }
            try {
                Thread.sleep(random.nextInt(1001));
                /* ensures random interval of less than 1 seconds between two push operations */
            } catch (Exception except) {
                System.out.println(except);
            }
        }
    }
}
class ThreadB extends Thread {
    public void run() {
        Random random = new Random();
        while (true) {
            if (Question2.size > 0) {
                Question2.size = Question2.size - 1;
                System.out.println("Popped " + Question2.stack.pop() + ". Size = " + Question2.size);
            } else {
                /**
                 * If the stack becomes empty while performing pop(), 
                 * that is , an underflow condition .
                 */
                System.out.println("Nothing to pop");
            }
            try {
                Thread.sleep(random.nextInt(1501));
                 /* ensures random interval of less than 1.5 seconds between two pop operations */
            } catch (Exception except) {
                System.out.println(except);
            }
        }

    }
}
public class Question2 {
    public static int size = 0;
    public static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args) {
        ThreadA first = new ThreadA();
        ThreadB second = new ThreadB();
        first.start();
        second.start();
    }
}