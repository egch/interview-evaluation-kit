package org.enricogiurin.interview.candidate.makeinterview.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsageOfSet {

  public static void main(String[] args) {
    new UsageOfSet().differentSet();
  }

  void differentSet() {
    // HashSet example
    Set<String> hashSet = new HashSet<>();
    hashSet.add("Banana");
    hashSet.add("Apple");
    hashSet.add("Orange");
    hashSet.add("Apple"); // Duplicate elements are not allowed
    System.out.println("HashSet: " + hashSet);  // Unordered output

    // TreeSet example
    Set<String> treeSet = new TreeSet<>();
    treeSet.add("Banana");
    treeSet.add("Apple");
    treeSet.add("Orange");
    System.out.println("TreeSet: " + treeSet);  // Sorted output (Alphabetical order)

    // LinkedHashSet example
    Set<String> linkedHashSet = new LinkedHashSet<>();
    linkedHashSet.add("Banana");
    linkedHashSet.add("Apple");
    linkedHashSet.add("Orange");
    System.out.println("LinkedHashSet: " + linkedHashSet);  // Insertion order maintained
  }

}
