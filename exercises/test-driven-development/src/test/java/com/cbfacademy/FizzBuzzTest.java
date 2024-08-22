package com.cbfacademy;

import static org.hamcrest.MatcherAssert.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    @DisplayName("returns when input is 1")

    public void printsFizz1() {
        final String actual = FizzBuzz.get(1);
        assertThat(actual, is("1"));
    }

    @Test
    @DisplayName("returns when input is 3")

    public void printsFizz3() {
        final String actual = FizzBuzz.get(3);
        assertThat(actual, is("3"));

    }
}
