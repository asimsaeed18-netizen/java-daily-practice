
package com.example.week_1.day_3;

import java.util.Deque;
import java.util.ArrayDeque;

public class Exercise9 {
    public static void main(String[] args) {
        String brackets = "{[()]}";
        Deque<Character> stack = new ArrayDeque<>();
        boolean balanced = true;

        for (int i = 0; i < brackets.length(); i++) {
            char ch = brackets.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }
                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    balanced = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            balanced = false;
        }
        if (balanced) {
            System.out.println("Brackets are balanced.");
        } else {
            System.out.println("Brackets are not balanced.");
        }
    }
}