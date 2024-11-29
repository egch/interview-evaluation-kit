package org.enricogiurin.interview.candidate.makeinterview.coding;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.enricogiurin.interview.candidate.makeinterview.coding.CalculateTheSumOfEvenElementsInALinkedList.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculateTheSumOfEvenElementsInALinkedListTest {
  CalculateTheSumOfEvenElementsInALinkedList instance;

  //2 -> 5 -> 6 -> 9 -> 10
  @Test
  void calculate_solution() {
    ListNode head = new ListNode(2);
    head.next = new ListNode(5);
    head.next.next = new ListNode(6);
    head.next.next.next = new ListNode(9);
    head.next.next.next.next = new ListNode(10);

    int result = instance.calculate_solution(head);

    assertThat(result).isEqualTo(18);

  }

  @BeforeEach
  void setUp() {
    this.instance = new CalculateTheSumOfEvenElementsInALinkedList();

  }
}