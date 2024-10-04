package org.enricogiurin.interview.candidate.makeinterview.coding;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindTheFirstDuplicateTest {

  FindTheFirstDuplicate instance;

  @Test
  void find_solution() {
    int[] array = {1, 3, 5, 7, 1, 7};
    int result = instance.find_solution(array);
    assertThat(result).isEqualTo(1);

    array = new int[]{0, 1, 2, 3, 4, 5};
    result = instance.find_solution(array);
    assertThat(result).isEqualTo(-1);
  }

  @BeforeEach
  void setUp() {
    this.instance = new FindTheFirstDuplicate();
  }
}