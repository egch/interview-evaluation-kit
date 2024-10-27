package org.enricogiurin.interview.candidate.makeinterview.coding;

/*
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
public class MostFrequentElementInAnArray {


  public int mostFrequentElementInAnArray(int[] array) {
    //write your solution here
    return 0;
  }

  public int mostFrequentElementInAnArray_solution(int[] array) {
    int element = 0;
    int times = 0;
    int[] values = new int[101];
    for (int n : array) {
      values[n]++;
      if (values[n] > times) {
        times = values[n];
        element = n;
      }
    }
    return element;
  }

}
