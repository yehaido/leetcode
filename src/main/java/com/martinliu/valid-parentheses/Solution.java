package com.martinliu.validparentheses;
import java.util.*;

/**
   Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

   The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/
public class Solution
{
    public boolean isValid(String s) {
        if (s == null){
            return false;
        } else {
            Stack<Character> stack = new Stack<Character>();
            char[] chars = s.toCharArray();
            for (char c : chars){
                if (stack.empty() || !isPar(stack.peek(), c)){
                    stack.push(c);
                } else {
                    stack.pop();
                }
            }

            return stack.empty();
        }
    }

    private boolean isPar(char c1, char c2){
        if (c1 == '('){
            return c2 == ')';
        } else if (c1 == '[') {
            return c2 == ']';
        } else if (c1 == '{') {
            return c2 == '}';
        } else {
            return false;
        }
    }
}
