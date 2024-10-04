package org.enricogiurin.interview.candidate.makeinterview;

public class UsageOfSynchronized {

  static class Counter {

    private int count = 0;

    // Synchronized method to ensure thread-safe increment
    public synchronized void increment() {
      count++;
    }

    // Synchronized method to safely get the count value
    public synchronized int getCount() {
      return count;
    }

    void increment2() {
      synchronized (this) {
        count++;
      }
    }
  }


}


