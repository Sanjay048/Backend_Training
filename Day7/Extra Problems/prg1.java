/*1.
Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
A substring is a contiguous sequence of characters within a string.

Example 1:
Input: patterns = ["a","abc","bc","d"], word = "abc"
Output: 3
Explanation:
- "a" appears as a substring in "abc".
- "abc" appears as a substring in "abc".
- "bc" appears as a substring in "abc".
- "d" does not appear as a substring in "abc".
*/

package Day7;

public class prg1 {
    public static int countSubstring(String[] patterns, String word){
        int count =0;
        for(String x: patterns){
            if (word.contains(x)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String patterns[] = {"a","abc","bc","d"};
        String word = "abc";
        int count = countSubstring(patterns,word);
        System.out.println("No of times appears : "+count);
    }
}
