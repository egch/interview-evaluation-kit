package org.enricogiurin.interview.candidate.makeinterview.coding;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IsStringPalindromeTest {
  IsStringPalindrome instance;

  @Test
  void solution2() {
    String s = "abcba";
    boolean result = instance.solution2(s);
    assertThat(result).isTrue();

    s = "abba";
    result = instance.solution2(s);
    assertThat(result).isTrue();

    s = "abc";
    result = instance.solution2(s);
    assertThat(result).isFalse();

  }

  @BeforeEach
  void setUp() {
    this.instance = new IsStringPalindrome();
  }
}