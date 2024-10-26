package org.enricogiurin.interview.candidate.makeinterview;

public class UseOfException {

    public void ex1() {
        //throw  new Exception("");
    }

    public void ex2() {
        //throw  new RuntimeException("");
    }

    void tryWithNoCatch() {
        try {
            int result = 5/0;
            System.out.println("try completed");

        }finally {
            System.out.println("finally executed");
        }
    }


    //exercise
    void rte() throws RuntimeException{
        throw new RuntimeException("RTE");
    }

    void ce() throws Exception {
        throw new Exception("ex");
    }

    //how to fix this?
/*    void caller() {
        rte();
        ce();
    }*/

    public static void main(String[] args) {
        new UseOfException().tryWithNoCatch();
    }
}
