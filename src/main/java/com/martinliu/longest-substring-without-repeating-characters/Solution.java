package com.martinliu.longestsubstringwithoutrepeatingcharacters;
import java.util.*;

/**
   Given a string, find the length of the longest substring without repeating characters.
   For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
*/
public class Solution
{
    public int lengthOfLongestSubstring(String s) {
        if (s == null){
            return 0;
        } else {
            char[] chars = s.toCharArray();
            String curr = "";
            String sub = null;
            int len = 0;
            for(char c : chars){
                int index = curr.indexOf(String.valueOf(c));
                if (index >= 0){
                    if (len < curr.length()){
                        sub = curr;
                        len = curr.length();
                    }
                    // recalculate from the char after the duplicate
                    curr = curr.substring(index + 1, curr.length());
                }
                curr += c;
            }

            // for last append
            len = Math.max(len, curr.length());
            return len;
        }
    }
}
