package com.michelle.leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String longestPrefix = "";

        String firstWord = strs[0];
        for (int i = 0; i < firstWord.length(); i++) {
            char currentChar = firstWord.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                String nextWord = strs[j];
                if (i < nextWord.length()) {
                    char nextWordChar = strs[j].charAt(i);
                    if (!twoCharsSame(currentChar, nextWordChar)) {
                        return longestPrefix;
                    }
                } else {
                    return longestPrefix;
                }

            }
            longestPrefix += currentChar;
        }
        return longestPrefix;
    }

    private boolean twoCharsSame(char a, char b) {
        return a == b;
    }
}
