package com.michelle.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String stringed = Integer.toString(x);
        int middle = stringed.length() / 2;

        String reversed = "";

        for (int i = stringed.length() -1; i >= 0; i--) {
            reversed += stringed.charAt(i);
        }
        return stringed.substring(0, middle).equals(reversed.substring(0, middle));
    }
}
