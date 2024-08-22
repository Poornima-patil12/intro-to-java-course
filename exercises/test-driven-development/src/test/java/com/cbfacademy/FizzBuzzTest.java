package com.cbfacademy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FizzBuzzTest {

    static Stream<Arguments> InputAndOutput() {
        return Stream.of(arguments(1, "1"),
                arguments(2, "2"),
                arguments(3, "Fizz"),
                arguments(4, "4"),
                arguments(5, "Buzz"),
                arguments(6, "Fizz"),
                arguments(7, "7"),
                arguments(8, "8"),
                arguments(9, "Fizz"),
                arguments(10, "Buzz"),
                arguments(11, "11"),
                arguments(12, "Fizz"),
                arguments(13, "13"),
                arguments(14, "14"),
                arguments(15, "FizzBuzz"));
    }

    @ParameterizedTest
    @MethodSource("InputAndOutput")
    @DisplayName("return EXPECTED when input is BETWEEN 1 to 15")

    public void printsFizzBuzz(Integer n, String expected) {
        final String actual = FizzBuzz.get(n);
        assertThat(actual, is(expected));
    }

}
