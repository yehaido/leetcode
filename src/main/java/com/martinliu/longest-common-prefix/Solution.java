package com.martinliu.longestcommonprefix;
import java.util.*;

/**
   Write a function to find the longest common prefix string amongst an array of strings.
*/
public class Solution
{
    public String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0){
            return "";
        } else {
            String pre = null;
            for (String s : strs) {
                if (null == pre){
                    pre = s;
                } else {
                    while (!"".equals(pre) && !s.startsWith(pre)){
                        pre = pre.substring(0, pre.length() - 1);
                    }
                    if ("".equals(pre)){
                        return "";
                    }
                }
            }
            return pre;
        }
    }
}
