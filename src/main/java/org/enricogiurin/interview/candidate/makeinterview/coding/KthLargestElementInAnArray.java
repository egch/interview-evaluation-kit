package org.enricogiurin.interview.candidate.makeinterview.coding;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 *
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 * Example 2:
 *
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 *
 *
 * Constraints:
 *
 * 1 <= k <= nums.length <= 105
 * -104 <= nums[i] <= 104
 */
public class KthLargestElementInAnArray {
  public int findKthLargest(int[] nums, int k) {

      //write ur solution here
      return 0;

    }


    //WARN DO NOT COPY THIS!
    public int findKthLargest_solution(int[] nums, int k) {

        Queue<Integer> queue = new PriorityQueue<>();
        for(int num:nums) {
          queue.add(num);
          if(queue.size()>k){
            queue.poll();
          }
        }
        return queue.peek();
      }

  }
