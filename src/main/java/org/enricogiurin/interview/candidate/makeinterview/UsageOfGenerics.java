package org.enricogiurin.interview.candidate.makeinterview;

import java.util.List;

/*
In Java, how would you implement a method that accepts a list of any type (List<T>) and returns the first element of the list?
Additionally, explain how you would modify this method to only accept lists of types that extend Number.
 */
public class UsageOfGenerics {

  public <T> T getFirstElement(List<T> list) {
    return list.isEmpty() ? null : list.get(0);
  }

  public <T extends Number> T getFirstElementBounded(List<T> list) {
    return list.isEmpty() ? null : list.get(0);
  }


}
