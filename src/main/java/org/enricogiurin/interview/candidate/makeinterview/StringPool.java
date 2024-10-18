package org.enricogiurin.interview.candidate.makeinterview;

public class StringPool {

  public static void main(String[] args) {
    new StringPool().compare();
  }

  public void compare() {
    String s1 = "s1";
    String s2 = "s1";
    String s3 = new String("s1");
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s3));
  }

}
