package org.enricogiurin.interview.candidate.makeinterview.designpatterns;

import java.util.List;

public class Immutability {

}

class WrapList {

  public List<String> list;

  public WrapList(List<String> list) {
    this.list = list;
  }

  public List<String> getList() {
    return list;
  }
}


//Make the class final: This prevents subclassing.
final class WrapListImmutable {

  // The list is declared private and final
  private final List<String> list;

  // Constructor creates a defensive copy of the passed-in list and wraps it with Collections.unmodifiableList()
  public WrapListImmutable(List<String> list) {
    // Defensive copy to avoid modification of the original list outside this class
    this.list = List.copyOf(list);
  }

  // Returns an unmodifiable view of the list to prevent modification by the caller
  public List<String> getList() {
    return list;
  }
}