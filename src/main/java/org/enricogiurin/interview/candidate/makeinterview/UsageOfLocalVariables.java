package org.enricogiurin.interview.candidate.makeinterview;

public class UsageOfLocalVariables {

  void hello() {
    //What is the default value stored in Local Variables?
/*    int x = 5;
    int y;
    System.out.println("x : "+x);
    System.out.println("y : "+y);*/
  }

}

/*
Q: Why does the compiler allow the declaration of int y; but not its use in System.out.println() without initialization?
 */
/*

A: The compiler allows the declaration of int y; without initialization because in Java, it's perfectly valid to declare a local variable without immediately assigning it a value.
 However, Java requires that all local variables be explicitly initialized before they are used in any operation, such as in System.out.println().

Key Reasons:
No Default Value for Local Variables:

Unlike instance or static variables, local variables are not assigned default values by the JVM. If the compiler allowed the use of an uninitialized local variable, its value would be undefined, leading to unpredictable behavior.
 */