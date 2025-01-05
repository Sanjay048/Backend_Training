/*Write a Java program to demonstrate the use of multithreading. The program should:
Create two threads:
Thread 1: Print numbers from 1 to 10 with a 500ms delay between each number.
Thread 2: Print the square of numbers from 1 to 10 with a 700ms delay between each number.
Ensure both threads run concurrently.
Use Thread class or Runnable interface for thread implementation.
*/

package Day7;

public class ThreadsIntro{
    public static class NumberThread extends Thread{
        @Override
        public void run(){
            try {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("Number : " + i);
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){
                System.out.println("Number Thread interrupt");
            }
        }
    }
    public static class SquareThread extends Thread{
        @Override
        public void run(){
            try {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("Square : " + (i*i));
                    Thread.sleep(700);
                }
            }catch (InterruptedException e){
                System.out.println("Square Thread interrupt");
            }
        }
    }

    public static void main(String[] args) {
        Thread numberThread = new NumberThread();
        Thread squareThread = new SquareThread();
        numberThread.start();
        squareThread.start();
    }
}
