package com.cbfacademy;

import com.cbfacademy.search.Search;

public class BinarySearch implements Search {

    public int search(int[] sortedArray, int target) {

        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (sortedArray[mid] == target) {
                return mid;
            }

            // If target greater, ignore left half
            if (sortedArray[mid] < target) {
                left = mid + 1;
            } else {
                // If target is smaller, ignore right half
                right = mid - 1;
            }
        }

        // Target is not present in the array
        return -1;
    }
}
