package com.ptl.training.junit5talk;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class IgnoreSomeMethod {

    @BeforeAll
    static void setEnvironment() {
        System.setProperty("ENV", "DEV");
    }

    @Test
    @Disabled("only run locally")
    void test_which_should_not_run() {
        System.out.println("This test should not run");
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void test_only_on_mac() {
        System.out.println("test_only_on_mac");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void test_only_on_windows() {
        System.out.println("test_only_on_windows");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void test_only_on_jre8() {
        System.out.println("test_only_on_jre8");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void test_only_on_jre11() {
        System.out.println("test_only_on_jre11");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "jbeauce")
    void test_only_with_jbeauce() {
        System.out.println("test_only_with_jbeauce");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "jboss")
    void test_only_with_jboss() {
        System.out.println("test_only_with_jboss");
    }


    @Test
    void test_only_on_dev() {
        assumeTrue("DEV".equals(System.getProperty("ENV")));
        System.out.println("test_only_on_dev");
    }

    @Test
    void test_only_on_prod() {
        assumeTrue("PROD".equals(System.getProperty("ENV")));
        System.out.println("test_only_on_prod");
    }
}
