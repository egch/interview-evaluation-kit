package org.enricogiurin.interview.candidate.makeinterview;

import java.util.HashSet;
import java.util.Set;

public class CollectionQuestions {


    public static void main(String[] args) {
        new CollectionQuestions().useOfSet();

    }



    public void stream(){

    }

    public void useOfSet(){
        User userA = new User("enrico");
        User userB = new User("enrico");
        User userC = new User("Mario");

        Set<User> set = new HashSet<>();
        set.add(userA);
        set.add(userB);
        set.add(userC);

        System.out.println("size "+set.size());
    }


    private static class User {
        String name;

        public User(String age) {
            this.name = age;
        }

        public String getName() {
            return name;
        }


        @Override
        public boolean equals(Object o) {
            return super.equals(o);

        }

        @Override
        public int hashCode() {
            return super.hashCode();

        }
    }
}
