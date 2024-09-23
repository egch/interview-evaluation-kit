package org.enricogiurin.interview.candidate.makeinterview;

public class UseOfException {

    public void ex1() {
        //throw  new Exception("");
    }

    public void ex2() {
        throw  new RuntimeException("");
    }

    void tryWithNoCatch() {
        try {
            int result = 5/0;
            System.out.println("try completed");

        }finally {
            System.out.println("finally executed");
        }
    }

    public static void main(String[] args) {
        new UseOfException().tryWithNoCatch();
    }
}
