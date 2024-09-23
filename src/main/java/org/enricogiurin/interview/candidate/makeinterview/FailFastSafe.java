package org.enricogiurin.interview.candidate.makeinterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


//https://www.geeksforgeeks.org/fail-fast-fail-safe-iterators-java/#:~:text=Difference%20between%20Fail%20Fast%20Iterator,as%20the%20fail%2Dsafe%20iterator.
public class FailFastSafe {

    public static void main(String[] args) {
        new FailFastSafe().failSafe();
    }



    //https://www.baeldung.com/java-fail-safe-vs-fail-fast-iterator
    private void failFast(){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("First", 10);
        map.put("Second", 20);
        map.put("Third", 30);
        map.put("Fourth", 40);

        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            map.put("Fifth", 50);
        }
    }

    private void failSafe(){
        Map<String, Integer> map = new ConcurrentHashMap<>();

        map.put("First", 10);
        map.put("Second", 20);
        map.put("Third", 30);
        map.put("Fourth", 40);

        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            map.put("Fifth", 50);
        }
    }

    //Exception in thread "main" java.util.ConcurrentModificationException

}
