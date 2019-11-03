package com.ptl.training.junit5talk.tags;

import org.junit.jupiter.api.Test;

public class TestOnlyInProduction {
    @Test
    void someTest() {
        System.out.println("some test in TestOnlyInProduction");
    }
}
