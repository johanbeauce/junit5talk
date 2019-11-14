package com.ptl.training.junit5talk;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParamsTest {

    static class Toto {
    }

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new Toto()),
                Arguments.of(new Toto()),
                Arguments.of(new Toto()));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Vincent", "Nathalie", "Ricardo"})
    void test_params_value(Object name) {
        System.out.println(name);
    }

    @ParameterizedTest
    @EnumSource(DAYS.class)
    void test_params_enum_value(DAYS day) {
        System.out.println(day);
    }

    @ParameterizedTest
    @CsvSource({"1, Vincent", "2, Nathalie", "3, Ricardo"})
    void test_params_csv_source(int id, String name) {
        System.out.println(id + " - " + name);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/input.csv", delimiter = ';', numLinesToSkip = 1)
    void test_params_csv_file_source(int id, String firstName, String lastName) {
        System.out.println(id + " - " + firstName + " - " + lastName);
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    void test_params_method_source(Toto toto) {
        System.out.println(toto);
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentsSourceClass.class)
    void test_params_arguments_source(String name, int id, List<String> list) {
        System.out.println(id + " - " + name + " - " + list);
        assertEquals(5, name.length());
        assertTrue(id > 0 && id < 4);
        assertEquals(2, list.size());
    }
}
