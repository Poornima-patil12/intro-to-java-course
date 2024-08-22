package com.cbfacademy;

public class FizzBuzz {

    public static String get(Integer n) {
        // throw new RuntimeException("Not implemented");
        if (n % 3 == 0 && n % 5 == 0)
            return "FizzBuzz";
        if (n % 5 == 0)
            return "Buzz";
        if (n % 3 == 0)
            return "Fizz";
        return n.toString();
    }
}