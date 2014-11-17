package com.martinliu.reverseinteger;
import java.util.*;

/**
   Reverse digits of an integer.

   Example1: x = 123, return 321
   Example2: x = -123, return -321
*/
public class Solution
{
    public int reverse(int x) {
        int ret = 0;

        while (x != 0){
            // check befor overflow
            if (Math.abs(ret) > Integer.MAX_VALUE/10){
                return 0;
            }
            ret = ret * 10 + x % 10;
            x = x / 10;
        }

        return ret;
    }
}
