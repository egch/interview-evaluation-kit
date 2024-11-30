package org.enricogiurin.interview.candidate.makeinterview.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/*
Q. What is wrong with the above implementation in a multi-threaded environment?
 */
public class Counter {
  private int count = 0;

  public void increment() {
    count++;
  }

  public int getCount() {
    return count;
  }
}

//solution
class SynchroCounter {
  private final AtomicInteger count = new AtomicInteger(0);

  public void increment() {
    count.incrementAndGet();
  }

  public int getCount() {
    return count.get();
  }
}