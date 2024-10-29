package org.enricogiurin.interview.candidate.makeinterview;

public class UsageOfThreads {
    public static void main(String[] args) {
        //start a thread with an instance of MyRunnable
        MyRunnable mr = new MyRunnable();
        //Thread t
    }
}

class MyRunnable implements  Runnable {

    @Override
    public void run() {
        System.out.println("hello");
    }
}


