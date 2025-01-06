/*Write a function to rotate an array of n integers to the right by k steps.


Example:
Input: nums = [1, 2, 3, 4, 5, 6, 7], k = 3
Output: [5, 6, 7, 1, 2, 3, 4]
Explanation: Rotate the array to the right by 3 steps.
*/

package Day8;

public class prg2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 10,n=k;
        while (k>nums.length){
            k= k%nums.length;
        }
        int[] nums1 = new int[nums.length];
        for (int i = 0; i <= k ; i++) {
            nums1[i] = nums[k+i];
        }
        int j =0;
        for (int i = k+1; i < nums.length ; i++) {
            nums1[i] = nums[j];
            j++;
        }
        System.out.print("After rotating "+n+" times : ");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
    }
}
