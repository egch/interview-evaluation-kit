package org.enricogiurin.interview.candidate.makeinterview;

public class OverrideAndOverloading {

    private static class Parent {
        void hello(){
            System.out.println("I am the parent");
        }


    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.hello();

    }

    private static class Child extends Parent {

    }
}
