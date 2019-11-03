package com.ptl.training.junit5talk;

import org.junit.jupiter.api.Test;

public class AssertionsTest {
    @Test
    void testSomeAssertions() {
        Person john = new Person(1, "John", "Doe");
        Person jane = new Person(2, "Jane", "Doe");
        Person johnCloned = john;

    }

}
