package com.ptl.training.junit5talk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {

    Greeting greeting;

    static void beforeClass() {
        System.out.println("");
    }

    void beforeEachTestMethod() {
        System.out.println("");
    }

    @Test
    void helloWorld() {
        System.out.println("helloWorld");
        greeting = new Greeting();
        assertEquals("hello world", greeting.helloWorld());
    }

    void afterEachTestMethod() {
        System.out.println("");
    }

    static void afterClass() {
        System.out.println("");
    }
}