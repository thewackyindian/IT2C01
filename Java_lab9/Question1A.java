/**
* author : Raj Karan Singh Chhabra
**/

import java.util.Scanner;
/** 
* it is hard to get an error ,
* while using an unsynchronized counter with
* several threads. 
*/
public class Question1A {
    /** In this class  , No synchronization is
     *  used, so this counter is not "thread-safe". 
     */
    static class Counter {
        int count;
    
        void inc() {
            count = count+1;
        }
        int getCount() {
            return count;
        }
    }
    

    static Counter counter;          // The counter that will be incremented.
    static int numberOfIncrements;   // Number of times each thread will increment it. 
    
    static class IncrementerThread extends Thread {
        public void run() {
            for (int i = 0; i < numberOfIncrements; i++) {
                counter.inc();
            }
        }
    }
     /**
     * This main function  gets the number of threads and the number of increments per thread
     * from the user.  It creates and starts the threads, and then
     * waits for them all to finish.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        while (true) {
            System.out.println();
            System.out.print("Enter number of threads (Enter 0 to end)? ");
            int numberOfThreads = sc.nextInt();
            if (numberOfThreads <= 0) 
                break;
            
            do {
                System.out.println();
                System.out.println("How many times should each thread increment the counter? ");
                numberOfIncrements = sc.nextInt();
                if (numberOfIncrements < 1) {
                    System.out.println("Number of increments must be positive.");
                    numberOfIncrements = 1;
                }
            } while (numberOfIncrements <= 0);
            
            System.out.println();
            System.out.println("Using " + numberOfThreads + " threads.");
            System.out.println("Each thread increments the counter " + numberOfIncrements + " times.");
            System.out.println();
            System.out.println("Working...");
            System.out.println();
            IncrementerThread[] workers = new IncrementerThread[numberOfThreads];
            counter = new Counter();
            for (int i = 0; i < numberOfThreads; i++)
                workers[i] = new IncrementerThread();
            for (int i = 0; i < numberOfThreads; i++)
                workers[i].start();
           
            for (int i = 0; i < numberOfThreads; i++) {
                try {
                    workers[i].join();
                }
                catch (InterruptedException e) {
                }
            }
            System.out.println("The final value of the counter should be : " + (numberOfIncrements*numberOfThreads));
            System.out.println("Actual final value of counter is: " + counter.getCount());
            System.out.println();
            System.out.println();
            
        } 
        sc.close();
    }
    /* the number of increments
    * probably has to be pretty large(1000000) ,to see an error . 
    */
}