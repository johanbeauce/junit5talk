package com.ptl.training.junit5talk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {

    Greeting greeting;

    static void beforeClass() {
        System.out.println("before the class");
    }

    void beforeMethod() {
        System.out.println("before the method");
    }

    @Test
    void helloWorld() {
        System.out.println("helloWorld");
        greeting = new Greeting();
        assertEquals("hello world", greeting.helloWorld());
    }

    void afterMethod() {
        System.out.println("after the method");
    }

    static void afterClass() {
        System.out.println("after the class");
    }
}