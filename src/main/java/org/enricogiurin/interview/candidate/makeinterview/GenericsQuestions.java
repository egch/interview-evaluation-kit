package org.enricogiurin.interview.candidate.makeinterview;

import java.util.ArrayList;
import java.util.List;

public class GenericsQuestions {


    public void list(){
        List<String> listGenerics =  List.of("s1", "s2", "s3");



        for(String s:listGenerics){
            System.out.println(s);
        }




        List list = List.of("s1", "s2", 5);
        //1) what to do to make this code compile
        //2) which exception we could experience at runtime once we fix the compilation issue

        for(Object s:list){

            System.out.println((String)s);

        }



    }

    public static void main(String[] args) {
        new GenericsQuestions().list();
    }

    private static void extends_generics(){
        List<Integer> list1 = new ArrayList<>();
        //List<Number> list2 = list1;
        List<? extends Number> list3 = list1;
    }
}
