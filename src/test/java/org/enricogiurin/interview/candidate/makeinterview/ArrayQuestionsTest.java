package org.enricogiurin.interview.candidate.makeinterview;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ArrayQuestionsTest  {
    private ArrayQuestions arrayQuestions;

    //findTheOnlyDuplicate




    @BeforeEach
    public void setUp() throws Exception {
        //TODO - what to insert here
        this.arrayQuestions = new ArrayQuestions();
    }

    @Test
    void findTheOnlyDuplicate() {
    }

    @Test
    void mostFrequentElementInAnArray() {
        int[] array = {1,2,3,7,3,7,3,7,7};
        int result = arrayQuestions.mostFrequentElementInAnArray_solution(array);
        assertThat(result==7).isTrue();
    }
}