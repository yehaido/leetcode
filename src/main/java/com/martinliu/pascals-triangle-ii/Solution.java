package com.martinliu.pascalstriangleii;
import java.util.*;

/**
   Given an index k, return the kth row of the Pascal's triangle.

   For example, given k = 3,
   Return [1,3,3,1].

   Note:
   Could you optimize your algorithm to use only O(k) extra space?
*/
public class Solution
{
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if (rowIndex >= 0){
            list.add(1);
            for (int i = 1; i < rowIndex + 1; i++) {
                int curr = 1;
                for (int j = 1; j < i; j++){
                    int sum = curr + list.get(j);

                    curr = list.get(j);
                    list.set(j, sum);
                }
                // last element
                list.add(1);
            }
        }
        return list;
    }
}
