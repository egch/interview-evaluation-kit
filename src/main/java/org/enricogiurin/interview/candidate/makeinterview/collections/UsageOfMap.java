package org.enricogiurin.interview.candidate.makeinterview.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
HashMap:

Explanation: Unordered collection that allows null keys and values. Provides constant-time performance for basic operations (O(1) for put/get).
Use Case: Best for quick lookups when order doesn't matter, e.g., caching data.
TreeMap:

Explanation: Sorted map that maintains keys in their natural order or by a comparator. Operations are O(log n) due to the underlying red-black tree.
Use Case: Useful when you need to maintain sorted data, such as implementing a leaderboard.
LinkedHashMap:

Explanation: Maintains insertion order or access order. Provides O(1) time for basic operations and is slightly slower than HashMap.
Use Case: Ideal for implementing LRU (Least Recently Used) caches where order of access matters.
 */
public class UsageOfMap {

  void usage() {
    HashMap<Character, Integer> hMap = new HashMap<>();
    TreeMap<Character, Integer> tMap = new TreeMap<>();
    LinkedHashMap<Character, Integer> lMap = new LinkedHashMap<>();
  }

}
