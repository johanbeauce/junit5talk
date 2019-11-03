package com.ptl.training.junit5talk;

import org.junit.jupiter.api.Test;

public class ParamsTest {
    
    @Test
    void test_params_value(int id, String name) {
        System.out.println(id + " - " + name);
    }

    @Test
    void test_params_enum_value(int id, String name) {
        System.out.println(id + " - " + name);
    }

    @Test
    void test_params_csv_source(int id, String name) {
        System.out.println(id + " - " + name);
    }

    @Test
    void test_params_csv_file_source(int id, String name) {
        System.out.println(id + " - " + name);
    }

    @Test
    void test_params_method_source(int id, String name) {
        System.out.println(id + " - " + name);
    }

    @Test
    void test_params_arguments_source(int id, String name) {
        System.out.println(id + " - " + name);
    }
}
