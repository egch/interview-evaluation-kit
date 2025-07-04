package org.enricogiurin.interview.candidate.makeinterview.coding;

/*
Given a string s, find the first non-repeating character in it and return its index.
If it does not exist, return -1.

Example 1:
Input: s = "abcac"
Output: 1 (b is at index 1)

Example 2:
Input: s = "aaab"
Output: 3

Example 3:
Input: s = "aabb"
Output: -1

Constraints:
1 <= s.length <= 105
s consists of only lowercase English letters.
 */
public class FirstUniqueCharacterInAString {

  public int firstUniqueChar(String s) {
    //write your solution here
    return -1;
  }


  public int firstUniqueChar_solution(String s) {
    int[] occurrences = new int[26];
    for(char c:s.toCharArray()){
      occurrences[c-'a']++;
    }
    for(int j=0;j<s.length();j++) {
      if(occurrences[s.charAt(j)-'a']==1){
        return j;
      }
    }
    return -1;
  }

}
