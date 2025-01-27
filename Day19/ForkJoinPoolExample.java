/*Exercise:
Write a program to calculate the sum of integers from 1 to 1,000,000 using the Fork/Join Pool.
Create a class SumTask that extends RecursiveTask<Long>.
Split the range of numbers into smaller tasks using the ForkJoinPool.
Combine the results from subtasks to get the total sum.
*/

package Day19;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolExample {

    private static final int THRESHOLD = 10000;
    public static void main(String[] args) {
        int start  = 1;
        int end = 1000000;
        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(start,end);
        long result = pool.invoke(task);
        System.out.println("Sum 1 to 1,000,000: " + result);
    }
    static class SumTask extends RecursiveTask<Long>{
        private final int start;
        private final int end;

        SumTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            if ((end-start)<=THRESHOLD){
                long sum = 0;
                for (int i = start; i <= end; i++) {
                    sum+=i;
                }
                return sum;
            }
            else {
                int mid = (start + end) / 2;
                SumTask leftTask = new SumTask(start, mid);
                SumTask rightTask = new SumTask(mid + 1, end);
                leftTask.fork();
                rightTask.fork();
                long leftResult = leftTask.join();
                long rightResult = rightTask.join();
                return leftResult + rightResult;
            }
        }
    }
}
