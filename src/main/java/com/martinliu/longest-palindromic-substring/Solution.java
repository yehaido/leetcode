package com.martinliu.longestpalindromicsubstring;
import java.util.*;

/**
   Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
*/
public class Solution
{
    public String longestPalindrome(String s) {
        if (s == null){
            return "";
        } else if (s.length() == 1){
            return s;
        } else {
            // make {'a', 'b'} to {'#', 'a', '#', 'b', '#'} style
            char[] chars = decorateChars(s.toCharArray());
            int len = chars.length;
            int retStart = 0;
            int retEnd = 0;
            for (int i = 0; i < len; i++) {
                char c = chars[i];
                int left = i;
                int right = i;
                while (left > 0 && right < len - 1 && chars[right + 1] == chars[left - 1]){
                    --left;
                    ++right;
                }
                if (right - left > retEnd - retStart){
                    retStart = left;
                    retEnd = right;
                }
            }
            String pal = s.substring(retStart/2, retEnd/2);
            return pal;
        }
    }

    // make {'a', 'b'} to {'#', 'a', '#', 'b', '#'} style
    private char[] decorateChars(char[] cs) {
        char[] chars = new char[cs.length * 2 + 1];
        chars[0] = '#';
        int curr = 1;
        for (char c : cs){
            chars[curr++] = c;
            chars[curr++] = '#';
        }
        return chars;
    }
}
