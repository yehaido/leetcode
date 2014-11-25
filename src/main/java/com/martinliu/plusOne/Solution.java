package com.martinliu.plusone;
import java.util.*;

/**
   Given a non-negative number represented as an array of digits, plus one to the number.

   The digits are stored such that the most significant digit is at the head of the list.
*/
public class Solution
{
    public int[] plusOne(int[] digts) {
        if (digts == null || digts.length == 0){
            return null;
        }
        boolean stop = false;
        int curr = digts.length - 1;
        while (curr >= 0 && !stop){
            if (digts[curr] < 9){
                digts[curr] = digts[curr] + 1;
                stop = true;
            } else {
                digts[curr--] = 0;
            }
        }
        if (curr == -1){
            int[] arr = new int[digts.length + 1];
            arr[0] = 1;
            for (int i = 0; i < digts.length; i++) {
                arr[i + 1] = digts[i];
            }
            digts = arr;
        }
        return digts;
    }
}
