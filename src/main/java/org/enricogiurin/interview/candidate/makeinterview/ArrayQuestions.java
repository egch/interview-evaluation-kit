package org.enricogiurin.interview.candidate.makeinterview;

import java.util.Map;

public class ArrayQuestions {

    /**
     * Return the number of occurrences of each element in the array.
     * CONSTRAINTS
     * Values of the array are in the range: [1, 1000]
     * array has length N>=2
     * Example:
     * {1,2,3,4,3} -> [1:1, 2:1 3:2, 4:1]
     * {1,1,1,1} -> [1:4]
     *
     *
     *[OPTIMIZATION] -> return an array with 0 to 100 indexes : {1,2,1,4} -> [0,2,1,0,1,...0]
     */
        public Map<Integer, Integer> occurrences(int[] array){


        return null;

    }


    /**
     * Return the number of occurrences of each element in the array.
     * The keys of the map need to be sorted in ascending order, i.e. -> 1, 3, 5 and so on
     *
     * Values of the array are in this range [1, 1000]
     * @param array
     * Example:
     * {1,2,3,4,3} -> [1:1, 2:1 3:2, 4:1]
     * //1 to 10
     * @return
     */
    public Map<Integer, Integer> occurrencesSortedByKeys(int[] array){


        return null;

    }


    /**
     * Given an array, find the most frequent element in it.
     * If there are multiple elements that appear a maximum number of times, print any one of them.
     * Examples:
     * Input : arr[] = {1, 3, 2, 1, 4, 1}
     * Output : 1 (it is present 3 times)
     * Explanation: 1 appears three times in array which is maximum frequency.
     * Input : arr[] = {10, 20, 10, 20, 30, 20, 20}
     * Output : 20 (it is present 4 times)
     * constraints:
     * array length >=1
     * array values in the range [0,100]
     * @param array
     * @return
     */
    public int mostFrequentElementInAnArray(int[] array){
        return 0;
    }

    public int mostFrequentElementInAnArray_solution(int[] array){
        int element=0;
        int times=0;
        int[] values = new int[101];
        for(int n:array){
            values[n]++;
            if(values[n]>times){
                times=values[n];
                element=n;
            }
        }
        return element;
    }

    /**
     * An array contains numbers. Exactly one number is duplicated in the array.
     * Write java function to find this duplicate.
     * All the elements are in the range [1, 100]
     * Array has length N>=2
     * Example:
     * [1,2,3,1] -> 1
     * [1,2,4,2] -> 2
     * @param array
     * @return
     */
    public int findTheOnlyDuplicate(int[] array){
        //write your solution here
        return 0;


    }

    /**
     * prints only the elements which are greater or equal to 5
     * @param array
     */
    public void iterate(int[] array ){

    }


    /**
     * An array contains numbers. Write java function to find all the (distinct) duplicates.
     * Return an array containing the elements which are present at least twice int the array.
     * Rxample:
     * [1,2,3] -> []
     * [1,2,4,2,1] -> [1,2]
     * [1,1,1,1,1] -> [1]
     * @param array
     * condition: array length >=1, values in the range[1,100]
     * @return the array containing the duplicates
     */
    public int[] findAllTheDuplicates(int[] array){
        //write your solution here
        return null;

    }

    /**
     * Returns the sum of the distinct element of the array.
     * Example [1,2,3,5,1] -> 1+2+3+5
     * @param array
     * @return
     */

    public int sumDistinct(int[] array){
        return 0;

    }

    /**
     * Return true if the element is present in the array.
     * Example {1,4,5,6} : 6 -> true / 0 -> return false
     * //case sorted array and un-sorted array
     * //
     * @param array
     * @param element
     * @return
     */
    public boolean findElement(int[] array, int element){
        //array has size N
        // array not sorted
        //[1,4,5,2, 10,6]
        //O(


        //sorted [1,2,5,7]
        //O



        return false;
    }
}
