package com.ptl.training.junit5talk;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionsTest {
    @Test
    void testSomeAssertions() {
        Person john = new Person(1, "John", "Doe");
        Person jane = new Person(2, "Jane", "Doe");
        Person johnCloned = john;

        assertTrue(john.getId() == 1);
        assertNotNull(jane);
        assertSame(john, johnCloned);

        RuntimeException exception = assertThrows(RuntimeException.class, () ->
                john.throwsException());
        assertEquals("boom!", exception.getMessage());

        assertTimeoutPreemptively(Duration.ofMillis(200L), () ->
                Thread.sleep(30L));

        assertAll("test first names",
                () -> assertEquals("Johnx", john.getFirstName(), "John is not the first name"),
                () -> assertEquals("Janex", jane.getFirstName(), "Jane is not the first name"));

    }

}
