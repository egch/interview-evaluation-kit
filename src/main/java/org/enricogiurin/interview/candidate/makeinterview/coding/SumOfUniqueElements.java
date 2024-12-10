package org.enricogiurin.interview.candidate.makeinterview.coding;
/*
ou are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.



Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
 */
public class SumOfUniqueElements {
  public int sumOfUnique(int[] nums) {
    //write your solution here
    return 0;

  }

  public int sumOfUnique_solution(int[] nums) {
    int[] occurences = new int[101];
    int result = 0;
    for(int num:nums){
      occurences[num]++;
    }
    for(int j=0;j<occurences.length;j++){
      if(occurences[j]==1){
        result +=j;
      }
    }
    return result;
  }

}
