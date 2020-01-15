package com.michelle.leetcode;

public class StrStr {
    public int strStr(String haystack, String needle) {
        boolean matches = false;

        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {

                if (i + j < haystack.length()) {
                    char currentHaystackChar = haystack.charAt(i + j);
                    char currentNeedleChar = needle.charAt(j);
                    if (currentNeedleChar == currentHaystackChar)  {
                        matches = true;
                    } else {
                        matches = false;
                        break;
                    }
                } else {
                    matches = false;
                }
            }
            if (matches) {
                return i;
            }
        }
        return -1;
    }
}
