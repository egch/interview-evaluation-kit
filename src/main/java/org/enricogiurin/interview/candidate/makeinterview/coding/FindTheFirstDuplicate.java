package org.enricogiurin.interview.candidate.makeinterview.coding;

public class FindTheFirstDuplicate {


  /**
   * An array contains numbers.
   * <p>
   * Write java function to find the first duplicate, return -1 otherwise. All the elements are in
   * the range [1, 100] Array has length N>=2 Example: [1,2,3,1] -> 1 [1,2,4,2] -> 2 [1,2,3,4] -> -1
   * //no duplicate
   *
   * @param array
   * @return first duplicate or -1
   */
  public int find(int[] array) {
    //write your solution here
    return 0;
  }


  public int find_solution(int[] array) {
    boolean[] occurrences = new boolean[101];
    for (int num : array) {
      if (occurrences[num]) {
        return num;
      }
      occurrences[num] = true;
    }

    return -1;
  }


}
