package org.enricogiurin.interview.candidate.makeinterview.inheritance.pets;




class Pet {
   String name;

  public Pet(String name) {
    this.name = name;
  }

  void eat() {
    System.out.println("Pet is eating");
  }
}

class Dog extends  Pet {
  String name;

  public Dog(String name) {
    super(name);
    this.name = name;
  }

  @Override
  void eat() {
    System.out.println("Dog is eating");
  }

}

public class OverrideMethodsAndAttributes {

  public static void main(String[] args) {
    Pet jimmy = new Dog("Jimmy");
    Dog fido = new Dog("Fido");

    jimmy.eat();
    fido.eat();
    System.out.println(jimmy.name);
    System.out.println(fido.name);
  }

}

// answers

/*
Dog is eating
Dog is eating
Jimmy
Fido
 */