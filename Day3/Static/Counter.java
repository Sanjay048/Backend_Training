/*Write a program with a class Counter that has a static variable to count the number of objects created.
Create three objects and print the count using a static method.*/

package Day3;

public class Counter{
    static int count = 0;

    public Counter(){
        count++;
    }
    public static int displayCount(){
        return count;
    }
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        System.out.println("count : "+displayCount());
    }
}
