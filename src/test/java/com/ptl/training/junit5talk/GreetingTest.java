package com.ptl.training.junit5talk;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GreetingTest {

    Greeting greeting;

    public GreetingTest() {
        System.out.println("constructor");
    }

    @BeforeAll
    void beforeClass() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    void beforeEachTestMethod() {
        System.out.println("@BeforeEach");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println("helloWorld");
        assertEquals("hello world", greeting.helloWorld());
    }

    @Test
    void hello() {
        System.out.println("hello");
        assertEquals("hello John", greeting.hello("John"));
    }

    @AfterEach
    void afterEachTestMethod() {
        System.out.println("@AfterEach");
    }

    @AfterAll
    void afterClass() {
        System.out.println("AfterAll");
    }
}