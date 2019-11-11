package com.ptl.training.junit5talk;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ArgumentsSourceClass implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                arguments("apple", 1, Arrays.asList("a", "b")),
                arguments("citrus", 2, Arrays.asList("k", "v")),
                arguments("lemon", 3, Arrays.asList("x", "y"))
        );
    }
}
