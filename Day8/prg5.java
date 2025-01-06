/*For each element in an array, find the next greater element to its right. If no such element exists, return -1 for that number.
Example:
Input: nums = [4, 5, 2, 10]
Output: [5, 10, 10, -1]
Explanation: The next greater element for 4 is 5, for 5 is 10, for 2 is 10, and for 10 there is no greater element.*/

package Day8;

public class prg5 {
    public static void main(String[] args) {
        int[]  nums = {4, 5, 2, 10};
        int[] nums1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length ; j++) {
                if(nums[i]<nums[j]){
                    nums1[i]=nums[j];
                    break;
                }
            }
        }
        nums1[nums1.length-1]=-1;
        System.out.println("After perform The next greater element");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
    }
}
