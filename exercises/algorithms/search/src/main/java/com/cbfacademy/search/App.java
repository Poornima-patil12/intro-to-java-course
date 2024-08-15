package com.cbfacademy.search;

import com.cbfacademy.BinarySearch;

public class App {
    public static void main(String[] args) {
        Search binarySearch = new BinarySearch();
        int[] sortedArray = { 2, 3, 4, 10, 40 };
        int target = 10;

        int result = binarySearch.search(sortedArray, target);
        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
