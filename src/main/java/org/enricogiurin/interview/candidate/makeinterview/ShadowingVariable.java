package org.enricogiurin.interview.candidate.makeinterview;
//https://en.wikipedia.org/wiki/Variable_shadowing#Java
public class ShadowingVariable {
    private int myIntVar = 0;

    public void shadowTheVar() {

        int myIntVar = 5;

        System.out.println(myIntVar); // prints ?

        System.out.println(this.myIntVar); // prints ?
    }

    public static void main(String[] args){
        new ShadowingVariable().shadowTheVar();
    }
}
