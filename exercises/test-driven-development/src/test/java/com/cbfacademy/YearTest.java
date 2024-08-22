package com.cbfacademy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

public class YearTest {

    static Stream<Arguments> InputAndOutput() {
        return Stream.of(arguments(1700, "false"),
                arguments(2000, "true"));
    }

    @Test
    @DisplayName("Return leap year")
    public void leapYear(Integer y, String expected) {
        final String actual = Year.isLeap(y);
        assertThat(actual, is(expected));

    }

}
