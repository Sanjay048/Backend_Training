/*Given a string s, return true if the s can be palindrome after deleting at most one character from it.
Example 1:
Input: s = "aba"
Output: true

Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

Example 3:
Input: s = "abc"
Output: false
*/

package Day7;

public class Prg3 {
    public static boolean validPalindrome(String str1){
        int left = 0;
        int right = str1.length()-1;
        while (left<right){
            if (str1.charAt(left)==str1.charAt(right)){
                left++;
                right--;
            }
            else return ispalindrome(str1,left+1,right) || ispalindrome(str1,left,right-1);
        }
        return true;
    }
    public static boolean ispalindrome(String str1, int left,int right){
        while (left<right){
            if(str1.charAt(left)!=str1.charAt(right)) return false;
                left++;
                right--;
        }
        return true;
    }
    public static void main(String[] args) {
        //String str1 = "aba";
        //String str1 = "abca";
        String str1 = "abc";
        if(validPalindrome(str1)) System.out.println(str1+" it is a palindrome");
        else System.out.println(str1+" it is not a palindrome");
    }
}
