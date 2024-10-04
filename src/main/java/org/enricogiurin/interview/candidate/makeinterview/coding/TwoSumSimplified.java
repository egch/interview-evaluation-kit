package org.enricogiurin.interview.candidate.makeinterview.coding;

import java.util.Arrays;
import java.util.HashSet;

/*
Given an array of integers nums and an integer target, return the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [2,7]
Explanation: Because nums[0] + nums[1] == 9, we return [2,7]

Example 2:
Input: nums = [3,2,4], target = 6
Output: [2,4]

Example 3:
Input: nums = [3,3], target = 6
Output: [3,3]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class TwoSumSimplified {

    public int[] twoSum(int[] nums, int target) {
        int[] ints ={0,0};
        //write your solution here
        //return an array of length 2
        return null;
    }

    public int[] twoSum_solution(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(target-num)){
                return new int[]{num, target-num};
            }
            set.add(num);
        }
        //write your solution here
        //return an array of length 2
        return null;

    }

    public static void main(String[] args) {

        int[] array = {5,3,3};
        int target = 6;
        int[] result = new TwoSumSimplified().twoSum_solution(array, target);
        System.out.println(Arrays.toString(result));;;
    }

}
