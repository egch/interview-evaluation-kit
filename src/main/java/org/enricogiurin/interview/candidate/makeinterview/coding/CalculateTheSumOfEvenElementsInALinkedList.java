package org.enricogiurin.interview.candidate.makeinterview.coding;
/*

//image: https://media.geeksforgeeks.org/wp-content/uploads/20240410135517/linked-list.webp
Problem Statement:
Write a function sumEvenElements(ListNode head) that takes the head of a singly linked list and
 returns the sum of all even elements in the list.

Example:

java
Copy code
Input: 2 -> 5 -> 6 -> 9 -> 10
Output: 18  // 2 + 6 + 10 = 18

Input: 1 -> 3 -> 5
Output: 0  // No even elements.

Input: Empty List
Output: 0
 */
public class CalculateTheSumOfEvenElementsInALinkedList {

  int calculate(ListNode head){
    //write your solution here
    return 0;

  }


  static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



  int calculate_solution(ListNode head){
    ListNode tmp = head;
    int result = 0;
    while (tmp!=null){
      if(tmp.val % 2 == 0){
        result +=tmp.val;
      }
      tmp = tmp.next;
    }


    return result;

  }
}
