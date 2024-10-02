package org.enricogiurin.interview.candidate.makeinterview.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseOfStream {

    public static void methodReference(){
        List<Integer> list = List.of(2, 3, 4, 5);

    }


    /**
     * Given an array of string return the list containing
     * only those whose length is greater or equal to 3 (>=3)
     * example:
     * ["aab", "aa", "aabbcc", ""] -> ["aab", ""aabbcc"]

     */
    private List<String> stream(String[] array){

        return null;
    }

    private List<String> streamSolution(String[] array){
        return Arrays.asList(array)
            .stream()
            .filter(s->s.length()>=3)
            .toList();

    }

    /**
     * Given a list of string return the upper case version
     * example:
     * ["aBaz", "aa"] -> ["ABAZ", "AA"]
     * @param list
     */
    private List<String> upperCase(List<String> list){

        return null;
    }

    private List<String> upperCaseSolved(List<String> list){

        return list.stream().map(String::toUpperCase).collect(Collectors.toList());





    }

    /*
          List<String> result = list.stream()
                .filter(s -> s.length() >= 5)
                .collect(Collectors.toList());
     */
}
