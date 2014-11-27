package com.martinliu.lengthoflastword;
import java.util.*;

/**
   Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

   If the last word does not exist, return 0.

   Note: A word is defined as a character sequence consists of non-space characters only.

   For example,
   Given s = "Hello World",
   return 5.
*/
public class Solution
{
    public int lengthOfLastWord(String s) {
        if (s == null){
            return 0;
        }
        char[] chars = s.toCharArray();
        int preNum = 0;
        int num = 0;
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            if (chars[i] != ' '){
                ++num;
            } else if (num != 0){
                preNum = num;
                num = 0;
            }
        }
        if (num == 0){
            num = preNum;
        }
        return num;
    }
}
