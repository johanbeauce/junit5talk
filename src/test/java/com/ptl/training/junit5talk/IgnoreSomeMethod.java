package com.ptl.training.junit5talk;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IgnoreSomeMethod {

    @BeforeAll
    static void setEnvironment() {
        System.setProperty("ENV", "DEV");
    }

    @Test
    void test_only_on_mac() {
        System.out.println("test_only_on_mac");
    }

    @Test
    void test_only_on_windows() {
        System.out.println("test_only_on_windows");
    }

    @Test
    void test_only_on_jre8() {
        System.out.println("test_only_on_jre8");
    }

    @Test
    void test_only_on_jre11() {
        System.out.println("test_only_on_jre11");
    }

    @Test
    void test_only_with_jbeauce() {
        System.out.println("test_only_with_jbeauce");
    }

    @Test
    void test_only_with_jboss() {
        System.out.println("test_only_with_jboss");
    }


    @Test
    void test_only_on_dev() {
        System.out.println("test_only_on_dev");
    }

    @Test
    void test_only_on_prod() {
        System.out.println("test_only_on_prod");
    }
}
