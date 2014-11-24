package com.martinliu.romantoint;
import java.util.*;

/**
   Given a binary tree, find its maximum depth.

   The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/
public class Solution
{
    private static Map<Character, Integer> map = new HashMap<Character, Integer>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    private int getInt(Character c){
        return map.get(c);
    }

    private boolean isCombine(char pre, char curr){
        if (pre == 'I'){
            return curr == 'V' || curr == 'X';
        }
        if (pre == 'X'){
            return curr == 'L' || curr == 'C';
        }
        if (pre == 'C'){
            return curr == 'D' || curr == 'M';
        }
        return false;
    }

    public int romanToInt(String s) {
        int num = 0;
        if (s == null){
            return 0;
        } else {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                num += this.getInt(c);
                if (i > 0){
                    char pre = chars[i - 1];
                    if (isCombine(pre, c)){
                        num -= 2 * this.getInt(pre);
                    }
                }
            }
        }
        return num;
    }
}
