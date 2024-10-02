package org.enricogiurin.interview.candidate.makeinterview.coding;

public class IsStringPalindrome {

  /**
   * Return true if the string is palindrome
   * Example: "abcba" -> true
   * Example: "123K321" -> true
   * "adce" - > return false
   * @param s s has length N > 0
   * @return
   */
  public boolean isPalindrome(String s){

    //writ ur solution here
    return false;
  }

  boolean solution2(String s) {
    char[] chars = s.toCharArray();
    for (int j = 0; j < s.length()/2; j++) {
      if(chars[j]!=chars[chars.length-1-j]){
        return false;
      }
    }
    return true;
  }

  public boolean solution3(String s) {
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
        return false;
      }
    }
    return true;
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

}
