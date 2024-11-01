package org.enricogiurin.interview.candidate.makeinterview.coding;

/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).



Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.


Constraints:

0 <= n <= 30
*/
public class Fibonacci {


    public int fib(int n) {
        //in the specifications n is in [0,30]
        return 0;
    }


    //"Big O of two to the power of n"
    //O(2^n)
    public int fib_recursive(int n) {
       if(n==0 || n==1) {
           return n;
       }
       return fib_recursive(n-1)+fib_recursive(n-2);
    }

    //O(N)
    public int fibIterative(int N) {
        if (N <= 1) {
            return N;
        }
        int previous = 1;
        int previousPrevious = 0;
        int current = 0;
        for (int i = 2; i <= N; i++) {
            current = previous + previousPrevious;
            previousPrevious = previous;
            previous = current;
        }
        return current;
    }

    //O(N)
    //Memoization (Caching):
    private int fibIterative_cache(int n) {
        //in the specifications n is in [0,30]
        return fibIterative_cache(n, new int[31]);
    }


    private int fibIterative_cache(int n, int[] cache) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (cache[n] != 0) {
            return cache[n];
        }
        int result = fibIterative_cache(n - 1, cache) + fibIterative_cache(n - 2, cache);
        cache[n] = result;
        return result;
    }

    public static void main(String[] args) {
        int result = new Fibonacci().fibIterative_cache(10);
        System.out.println(result);
    }
}
