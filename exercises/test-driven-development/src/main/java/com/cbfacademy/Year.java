package com.cbfacademy;

public class Year {
    public static String isLeap(Integer y) {
        if (y % 400 == 0 || y % 4 == 0)
            return "true";
        return "false";
    }
}
