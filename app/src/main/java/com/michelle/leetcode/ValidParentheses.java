package com.michelle.leetcode;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];

            if (isOpeningBracket(currentChar)) {
                stack.add(currentChar);
            } else {
                if (!stack.empty()) {
                    char popped = stack.pop();
                    if (currentChar != getMatchingBracket(popped)) {
                        return false;
                    }
                } else {
                    return false;
                }

            }
        }
        return stack.empty();

    }

    private char getMatchingBracket(char c) {
        if (c == '(') {
            return ')';
        } else if (c == ')') {
            return '(';

        } else if (c == '{') {
            return '}';
        } else if (c == '}') {
            return '{';

        } else if (c == '[') {
            return ']';
        } else if (c == ']') {
            return '[';
        } else {
            return 0;
        }
    }

    private boolean isOpeningBracket(char c) {
        return c == '{' || c == '[' || c == '(';
    }
}
