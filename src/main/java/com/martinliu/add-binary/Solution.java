package com.martinliu.addbinary;
import java.util.*;

/**
   Given two binary strings, return their sum (also a binary string).

   For example,
   a = "11"
   b = "1"
   Return "100".
*/
public class Solution
{
    public String addBinary(String a, String b) {
        if (a == null || "".equals(a)){
            return b;
        } else if (b == null || "".equals(b)) {
            return a;
        } else {
            char[] cA = a.toCharArray();
            char[] cB = b.toCharArray();
            int maxLen = Math.max(cA.length, cB.length);
            char[] addition = new char[maxLen];

            // whether have carry when each addition
            boolean carry = false;
            int last = 1;

            while (last <= maxLen){
                char currA = getCurr(cA, last);
                char currB = getCurr(cB, last);

                char added = add(currA, currB);
                boolean carryed = hasCarry(currA, currB);
                if (carry){
                    addition[maxLen - last] = add(added, '1');
                    carry = carryed || hasCarry(added, '1');
                } else {
                    addition[maxLen - last] = added;
                    carry = carryed;
                }
                ++last;
            }

            String ret = new String(addition);
            if (carry){
                ret = "1" + ret;
            }

            return ret;
        }
    }

    private char getCurr(char[] c, int last){
        if (last <= c.length){
            return c[c.length - last];
        } else {
            return '0';
        }
    }

    private boolean hasCarry(char a, char b) {
        if (a == '0' || b == '0'){
            return false;
        } else {
            return true;
        }
    }

    private char add(char a, char b){
        if (a == '0'){
            return b;
        } else if (b == '0'){
            return a;
        } else {
            // both are '1'
            return '0';
        }
    }
}
