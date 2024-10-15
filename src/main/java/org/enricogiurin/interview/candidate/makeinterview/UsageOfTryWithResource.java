package org.enricogiurin.interview.candidate.makeinterview;

public class UsageOfTryWithResource {

  void statement() {
    try (MyFileClass mf1 = new MyFileClass()) {
      throw new RuntimeException();
    } catch (Exception e) {
      System.out.println("catch");
    } finally {
      System.out.println("finally");
    }
  }

  //question: In order this class to compile what interface needs MyFileClass to implement?


  private static class MyFileClass implements AutoCloseable {

    @Override
    public void close() throws Exception {

    }
  }


}
