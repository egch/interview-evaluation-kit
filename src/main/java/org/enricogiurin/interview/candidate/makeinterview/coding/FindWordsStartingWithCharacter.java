package org.enricogiurin.interview.candidate.makeinterview.coding;

import java.util.ArrayList;
import java.util.List;

/*
You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that start with the character x.

Note that the returned array may be in any order.



Example 1:

Input: words = ["enrico","code"], x = "e"
Output: [0]

Example 2:
Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]

Example 3:

Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
Output: []



Constraints:

1 <= words.length <= 50
1 <= words[i].length <= 50
x is a lowercase English letter.
words[i] consists only of lowercase English letters.
 */
public class FindWordsStartingWithCharacter {

  public List<Integer> findWords(String[] words, char x) {
    //write ur solution here
    return null;
  }

  public List<Integer> findWords_solution(String[] words, char x) {
    List<Integer> list = new ArrayList<>();
    for (int j = 0; j < words.length; j++) {
      if (words[j].startsWith(x + "")) {
        list.add(j);
      }
    }
    return list;
  }

}
