package org.enricogiurin.interview.candidate.makeinterview.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureWithCallable {

  public static void main(String[] args) {
    new FutureWithCallable().future();
  }

  private Callable<Double> callable = () -> {
    try {
      Thread.sleep((int)(Math.random() * 1000) + 1);
      return Math.PI;
    }catch (Exception e){
      e.printStackTrace();
      return 0D;
    }
  };

  void future() {

    ExecutorService executorService = Executors.newFixedThreadPool(2);
    Future<Double> f1 = executorService.submit(callable);
    Future<Double> f2 = executorService.submit(callable);

    try {
      Double d1 = f1.get();
      Double d2 = f2.get();
      System.out.println(d1);  //3.141592653589793
      System.out.println(d2);  //3.141592653589793
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      executorService.shutdown();
    }
  }

}
