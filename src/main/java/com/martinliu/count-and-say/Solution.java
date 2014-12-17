package com.martinliu.countandsay;
import java.util.*;

/**
   The count-and-say sequence is the sequence of integers beginning as follows:
   1, 11, 21, 1211, 111221, ...

   1 is read off as "one 1" or 11.
   11 is read off as "two 1s" or 21.
   21 is read off as "one 2, then one 1" or 1211.
   Given an integer n, generate the nth sequence.

   Note: The sequence of integers will be represented as a string.
*/
public class Solution
{
    public String countAndSay(int n) {
        if (n < 1) {
            return null;
        } else if (n == 1){
            return "1";
        } else {
            String s = countAndSay(n - 1);
            char[] chars = s.toCharArray();
            char curr = chars[0];
            int num = 0;
            String ret = "";

            for (char c : chars) {
                if (c == curr) {
                    ++num;
                } else {
                    // number change
                    ret += num + String.valueOf(curr);
                    curr = c;
                    num = 1;
                }
            }
            // append last sequence of number
            ret += num + String.valueOf(curr);

            return ret;
        }
    }
}
