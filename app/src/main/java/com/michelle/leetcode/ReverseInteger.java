package com.michelle.leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        String reversed = "";
        String stringed = Integer.toString(x);

        if (x == 0) {
            return 0;
        } else if (x > 0) {
            for (int i = stringed.length() - 1; i >= 0; i--) {
                reversed += stringed.charAt(i);
            }
        } else {
            reversed += "-";
            for (int i = stringed.length() - 1; i >= 1; i--) {
                reversed += stringed.charAt(i);
            }
        }
        try {
            return Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
