package com.ptl.training.junit5talk;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    void test_params_csv_file_source(int id, String firstName, String lastName) {
        System.out.println(id + " - " + firstName + " - " + lastName);
    }

    void test_params_method_source(int id, String name) {
        System.out.println(id + " - " + name);
    }

    void test_params_arguments_source(String name, int id, List<String> list) {
        System.out.println(id + " - " + name + " - " + list);
        assertEquals(5, name.length());
        assertTrue(id > 0 && id < 4);
        assertEquals(2, list.size());
    }
}
