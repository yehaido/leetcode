package com.martinliu.zigzagconversion;
import java.util.*;

/**
   The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

   P   A   H   N
   A P L S I I G
   Y   I   R
   And then read line by line: "PAHNAPLSIIGYIR"
   Write the code that will take a string and make this conversion given a number of rows:

   string convert(string text, int nRows);
   convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*/
public class Solution
{
    public String convert(String s, int nRows) {
        if (s == null || "".equals(s) || nRows <= 1){
            return s;
        }
        int len = s.length();
        char[] ret = new char[len];
        int interval = nRows + nRows - 2;
        int curr = 0;
        for (int i = 0; i < nRows; i++) {
            for (int j = 0, index = 0; index < len ; ++j) {
                index = j * interval + i;
                if (i == 0 || i == nRows - 1){
                    // do nothing at first/last row
                } else {
                    // middle chars
                    int mid = interval * j - i;
                    if (mid > 0 && mid < len){
                        ret[curr++]= s.charAt(mid);
                    }
                }
                if (index < len){
                    ret[curr++]= s.charAt(index);
                }
            }
        }
        return new String(ret);
    }
}
