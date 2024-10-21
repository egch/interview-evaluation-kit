package org.enricogiurin.interview.candidate.makeinterview;

public class PatternMatchingForInstanceof {

  //Can you refactor this method using pattern matching introduced in Java 16?"
  void oldWay(Object obj) {
    if(obj instanceof  String){
      String s =(String)obj;
      System.out.println("length of string: "+s.length());
    }
  }

  void patternMatching(Object obj) {
    if(obj instanceof String s){
      System.out.println("length of string: "+s.length());
    }

  }

}
