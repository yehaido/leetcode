package com.martinliu.palindromenumber;
import java.util.*;

/**
   Determine whether an integer is a palindrome. Do this without extra space.
*/
public class Solution
{
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        } else if (x < 10){
            return true;
        } else {
            int tmp = x;
            int n = 0;
            while (tmp != 0){
                n = n * 10 + tmp % 10;
                tmp /= 10;
            }

            return n == x;
        }
    }
}
