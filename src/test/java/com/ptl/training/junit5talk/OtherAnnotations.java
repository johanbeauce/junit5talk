package com.ptl.training.junit5talk;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class OtherAnnotations {
    @Test
    void test_something_else() {
        System.out.println("test");
    }

    @RepeatedTest(5)
    void repeat(RepetitionInfo repetitionInfo) {
        System.out.println("hi!" + repetitionInfo.getCurrentRepetition() +
                "/" + repetitionInfo.getTotalRepetitions());
    }
}
