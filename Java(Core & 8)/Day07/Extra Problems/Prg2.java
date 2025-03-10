/*For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.
Given strings sequence and word, return the maximum k-repeating value of word in sequence.

Example 1:
Input: sequence = "ababc", word = "ab"
Output: 2
Explanation: "abab" is a substring in "ababc".

Example 2:
Input: sequence = "ababc", word = "ba"
Output: 1
Explanation: "ba" is a substring in "ababc". "baba" is not a substring in "ababc".*/

package Day7;

public class Prg2 {
    public static void main(String[] args) {
        String sequence = "ababac";
        String word = "ba";
        String empty = "";
        int count=0;
        for (int i = 0; i < sequence.length()-word.length(); i++) {
            empty=sequence.substring(i,word.length()+i);
            if (empty.equals(word)) count++;
        }
        System.out.println("No of time repeated substring : "+count);
    }
}
