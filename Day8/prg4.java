/*Given an array of integers and a target number, return the indices of the two numbers that add up to the target. Assume that there is exactly one solution.
Example:
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: nums[0] + nums[1] = 2 + 7 = 9.*/

package Day8;

public class prg4 {
    public static String sum(int[] number, int target){
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                if (number[i]+number[j]==target) return "["+i+" , "+j+"]";
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] number = {2,6,4,7,11,15};
        int target = 9;
        System.out.println(sum(number,target));
    }
}
