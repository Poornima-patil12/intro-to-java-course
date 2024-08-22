package com.cbfacademy;

import static org.hamcrest.MatcherAssert.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    @DisplayName("returns when input is 1")
    public void printsFizz() {
        final String actual = FizzBuzz.get(1);
        assertThat(actual, is("1"));
        // assertEquals("Fizz", FizzBuzz.get(3));
        // assertEquals("FizzBuzz", FizzBuzz.get(15));
    }
}
