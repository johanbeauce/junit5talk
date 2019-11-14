package com.ptl.training.junit5talk.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("dev")
public class TestInDevelopment {
    @Test
    void someTest() {
        System.out.println("some test in TestInDevelopment");
    }
}
