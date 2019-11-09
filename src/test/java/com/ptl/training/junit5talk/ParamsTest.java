package com.ptl.training.junit5talk;

public class ParamsTest {

    void test_params_value(String name) {
        System.out.println(name);
    }

    void test_params_enum_value(DAYS day) {
        System.out.println(day);
    }

    void test_params_csv_source(int id, String name) {
        System.out.println(id + " - " + name);
    }

    void test_params_csv_file_source(int id, String name) {
        System.out.println(id + " - " + name);
    }

    void test_params_method_source(int id, String name) {
        System.out.println(id + " - " + name);
    }

    void test_params_arguments_source(int id, String name) {
        System.out.println(id + " - " + name);
    }
}
