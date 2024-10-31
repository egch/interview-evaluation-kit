package org.enricogiurin.interview.candidate.makeinterview.inheritance;

import java.io.IOException;


//Q - "The following code attempts to override the eat method in subclasses of Pet.
// Can you identify any issues with this design related to exception handling? Explain your answer."
public class OverridingMethodsWithException {

  static class Pet {

    void eat() throws IOException {
    }

  }

/*  static class Dog extends Pet {
    void eat() throws Exception  {}
  }

  static class Cat extends Pet {
    void eat() throws RuntimeException  {}
  }*/

}
