package com.cbfacademy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class YearTest {

    static Stream<Arguments> InputAndOutput() {
        return Stream.of(arguments(1700, "false"),
                arguments(1800, "false"),
                arguments(1900, "false"),
                arguments(2000, "true"));
    }

    @ParameterizedTest
    @MethodSource("InputAndOutput")
    @DisplayName("Return leap year")
    public void leapYear(Integer y, Boolean expected) {
        final Year year = new Year(y);
        assertThat(year.isLeap(), is(expected));

    }

}
