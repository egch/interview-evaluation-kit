package org.enricogiurin.interview.candidate.makeinterview;

public class ExtendQuestions {

    class Pet {
        private int age;
        private String name;

        public Pet(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Pet() {
            this.age = 10;
            this.name = "noname";
        }
    }

    class Dog extends Pet {


    }

    public static void main(String[] args) {
        //Dog dog = new Dog(2, "jimmy");
    }
}
