package com.cbfacademy.strings;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static String concatenate(String word1, String word2, String word3) {
        // TODO: Write code that concatenates the input parameters and returns the
        // result
        return word1.concat(word2).concat(word3);
        // return String.join(delimiter:" ",word1,word2,word3);
        // throw new RuntimeException("Not implemented");
    }

    public static Boolean areEqual(String word1, String word2) {
        // TODO: Write code to determine whether the input parameters are equal strings
        return word1.equals(word2);
        // throw new RuntimeException("Not implemented");
    }

<<<<<<< HEAD
=======
    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[price]. Quantity: [quantity]". The price should be formatted to two decimal places, e.g. 99.99
        throw new RuntimeException("Not implemented");
    }
>>>>>>> aa9a8f7a9cdd6151bae5bb9bf1ca8923b5ba87de
}
