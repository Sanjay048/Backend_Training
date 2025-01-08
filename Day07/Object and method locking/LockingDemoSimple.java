/*Write a Java program to demonstrate object-level and method-level locking using multithreading. The program should:
Create a shared resource class (e.g., SharedPrinter) with two synchronized methods:
Method 1: Print a given string multiple times.
Method 2: Print a countdown from a given number.
Use two threads:
Thread 1: Calls the first synchronized method (print string).
Thread 2: Calls the second synchronized method (countdown).
Demonstrate the difference between:
Object-Level Locking: When both threads use the same instance of the shared resource.
Class-Level Locking: When both threads use a static synchronized method or block.
Show how the locks affect the execution order of the methods.
*/

package Day7;

class SharedResource {
    public synchronized void printString(String str) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Object Lock String: " + str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void countdown(int start) {
        for (int i = start; i > 0; i--) {
            System.out.println("Object Lock Countdown: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static synchronized void printStaticString(String str) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Class Lock String: " + str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static synchronized void staticCountdown(int start) {
        for (int i = start; i > 0; i--) {
            System.out.println("Class Lock Countdown: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class LockingDemoSimple {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        System.out.println("Object-Level Locking:");
        Thread t1 = new Thread(() -> resource.printString("sanji"));
        Thread t2 = new Thread(() -> resource.countdown(3));
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nClass-Level Locking:");
        Thread t3 = new Thread(() -> SharedResource.printStaticString("World"));
        Thread t4 = new Thread(() -> SharedResource.staticCountdown(3));

        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

