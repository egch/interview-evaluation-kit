package org.enricogiurin.interview.candidate.makeinterview;

import java.util.List;

public class Generics {

  public <T extends Number> void processList(List<T> list) {}


  public static void main(String[] args) {
    Generics generics = new Generics();

    //which of the following methods does compile?

    //generics.processList(List.of("s"));

    //generics.processList(List.of(1));
  }

}


