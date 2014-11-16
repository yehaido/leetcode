package com.martinliu.singlenumber;
import java.util.*;

/**
   Given an array of integers, every element appears twice except for one. Find that single one.

   Note:
   Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

*/
public class Solution
{
    public int singleNumber(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int len = A.length;
        for (int i = 0; i < len; i++) {
            Integer tmp = map.get(A[i]);
            if (tmp != null){
                map.remove(A[i]);
            } else {
                map.put(A[i], A[i]);
            }
        }
        Object[] a = map.keySet().toArray();
        return (Integer)a[0];
    }
}
