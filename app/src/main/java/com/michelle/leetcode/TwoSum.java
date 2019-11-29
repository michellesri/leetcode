package com.michelle.leetcode;

public class TwoSum {
    int[] solution = new int[2];
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int numToFindInJ = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == numToFindInJ) {
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }
        return solution;
    }
}
