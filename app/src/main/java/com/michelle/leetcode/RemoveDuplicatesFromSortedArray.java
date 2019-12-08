package com.michelle.leetcode;

public class RemoveDuplicatesFromSortedArray {

    // O(n^2)
    public int removeDuplicatesSlow(int[] nums) {

        int counter = 0;
        if (nums.length > 0) {
            counter = 1;
        } else {
            return counter;
        }


        int arraySize = nums.length;
        for (int i = 0; i < arraySize - 1;) {
            int current = nums[i];
            int next = nums[i + 1];

            if (current == next) {
                for (int j = i + 1; j < arraySize - 1; j++) {
                    nums[j] = nums[j+1];
                }
                arraySize--;
            } else {
                counter++;
                i++;
            }
        }

        return counter;
    }

    // O(n)
    public int removeDuplicatesFaster(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
