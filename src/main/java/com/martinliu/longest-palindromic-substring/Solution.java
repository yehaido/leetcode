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
            String pal = "";

            int start = 0;
            int end = 0;
            boolean oneChar = true;

            char[] chars = s.toCharArray();
            for (int i = 1; i < chars.length; i++) {
                char c = chars[i];

                if (oneChar && c == s.charAt(start)){
                    ++end;
                    // cover all of oneChar
                    while (start > 0 && s.charAt(start - 1) == c){
                        --start;
                    }
                } else if (start > 0 && s.charAt(start - 1) == c){
                    --start;
                    ++end;
                    oneChar = false;
                } else {
                    // new circle
                    if (end + 1 - start > pal.length()){
                        pal = s.substring(start, end + 1);
                    }
                    // from end
                    i = start = end = (start + end)/2 + 1;
                    oneChar = true;
                }
            }
            // last circle's end
            if (end + 1 - start > pal.length()){
                pal = s.substring(start, end + 1);
            }

            return pal;
        }
    }
}
