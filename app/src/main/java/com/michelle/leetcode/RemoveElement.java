package com.michelle.leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        if (nums.length == 0) {
            return 0;
        }

        int arraySize = nums.length;
        for (int i = 0; i < arraySize;) {
            int current = nums[i];

            if (current == val) {
                for (int j = i; j < arraySize - 1; j++) {
                    nums[j] = nums[j+1];
                }
                arraySize--;
            } else {
                i++;
            }

        }

        return arraySize;
    }

    public int removeElementSimple(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
