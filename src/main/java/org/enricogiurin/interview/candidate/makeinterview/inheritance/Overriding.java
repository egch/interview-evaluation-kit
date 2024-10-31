package org.enricogiurin.interview.candidate.makeinterview.inheritance;

//Q: In the following code, subclasses of Pet override the age method with different return types.
// Can you identify any issues with this design? Explain which return types are valid and why.


public class Overriding {

  static class Pet {

    Number age() {
      return 0;
    }

  }

/*  static class Dog extends Pet {
    Integer age() {
      return 0;
    }
  }

  static class Cat extends Pet {
    String age() {
      return "30";
    }
  }*/

}

//Covariant