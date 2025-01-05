/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

package Day7;

public class prg4 {
    public static String sum(int[] number, int target){
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                if (number[i]+number[j]==target) return "number["+i+"] , number["+j+"]";
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
