package org.enricogiurin.interview.candidate.makeinterview;

public class OverrideAndOverloading {

    private static class Parent {
        void hello(){
            System.out.println("I am the parent");
        }

        void hello(String name){
            System.out.println("Hello "+name);
        }

        final static int x=5;
    }

    private static class Child extends Parent {
        void hello(){
            System.out.println("I am the child");
        }
        final static int x=10;
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.hello();
        System.out.println(p.x);
    }
}
