package org.enricogiurin.interview.candidate.makeinterview;

public class StringQuestions {


    /**
     * Return true if the string is palindrome
     * Example: "abcba" -> true
     * Example: "123aza321" -> true
     * "adce" - > return false
     * @param s s has length N > 0
     * @return
     */
    public boolean isPalindrome(String s){

        return false;
    }


    public boolean isPalindromeSolution(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    //java pool
    public void someStrings(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }

    //see src/main/java/org/enricogiurin/codingchallenges/leetcode/easy/ReverseString.java
    /**
     * Write a function that reverses a string. The input string is given as an array of characters s.
     *[extra]
     * You must do this by modifying the input array in-place with O(1) extra memory.
     * @param s
     * @return
     */
    public String reverse(String s) {
        char[] charArray = s.toCharArray();

        //write your solution here
        return null;

    }

    //src/main/java/org/enricogiurin/codingchallenges/leetcode/y2024/easy/FirstLetterToAppearTwice.java
    public char repeatedCharacter(String s) {
        //solution here
        return 'a';
    }

    /*
    Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:

Input: s = "loveleetcode"

Output: 2

Example 3:

Input: s = "aabb"

Output: -1



Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.
     */
    public int firstUniqChar(String s) {
        //solution here

     return -1;
    }

}
