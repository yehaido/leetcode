package com.martinliu.excelsheetcolumnnumber;
import java.util.*;

/**
   Given a column title as appear in an Excel sheet, return its corresponding column number.

   For example:

   A -> 1
   B -> 2
   C -> 3
   ...
   Z -> 26
   AA -> 27
   AB -> 28
*/
public class Solution
{
    public int titleToNumber(String s) {
        if (s == null){
            return 0;
        } else {
            int ret = 0;
            char[] chars = s.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                int r = chars.length - i - 1;
                int num = chars[i] - 64;
                ret += num * (int)Math.pow(26, r);
            }

            return ret;
        }
    }
}
