package org.enricogiurin.interview.candidate.makeinterview.designpatterns;

public class Singleton {

}
//Refactor the following Counter class to implement the Singleton design pattern.
// Ensure that only one instance of Counter can be created throughout the application
class Counter {
  private int cnt;

  public Counter(int cnt) {
    this.cnt = cnt;
  }

  public int getCnt() {
    return this.cnt;
  }
}
//SOLUTION
//DO NOT COPY
class CounterSingleton {
  private int cnt;
  private static CounterSingleton instance;

  private CounterSingleton(int cnt) {
    this.cnt = cnt;
  }

  public CounterSingleton getInstance() {
    if(instance==null){
      instance = new CounterSingleton(0);
    }
    return instance;

  }

  public int getCnt() {
    return this.cnt;
  }
}

