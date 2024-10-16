package org.enricogiurin.interview.candidate.makeinterview.coding;

/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.
Let's assume the words in the string s are separated by a single space


Example:
1) "Hello World" -> "World Hello"
2) "the sky is blue" -> "blue is sky the"


 */
public class ReverseWordsInAString {
  public String reverseWords(String s) {

    //write your solution here
    return "";
  }

  public String reverseWords_solution(String s) {
    String[] words = s.split("\\s+");

    StringBuilder sb = new StringBuilder();
    for(int j=words.length-1;j>=0;j--){
      sb.append(words[j]).append(" ");
    }
    return sb.toString().trim();
  }

}
