package org.enricogiurin.interview.candidate.makeinterview.inheritance;

public class ConstructorChain {

}

//Q "How would you refactor this Person class to use constructor chaining,
// ensuring that each constructor leverages existing constructors instead of duplicating code?
class Person {

  static final int DEFAULT_AGE = 5;
  static final String DEFAULT_NAME = "John Doe";

  private final String name;
  private final int age;


  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person(String name) {
    this.name = name;
    this.age = DEFAULT_AGE;
  }

}

//define the cosntructors here
/*
class Student extends Person {
    private String schoolName;
    private String grade;
}
*/

//solution
/*
public Person() {
  this("a", 2);
}
*/
