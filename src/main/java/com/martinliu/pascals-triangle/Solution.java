package com.martinliu.pascalstriangle;
import java.util.*;

/**
   Given numRows, generate the first numRows of Pascal's triangle.

   For example, given numRows = 5,
   Return

   [
   [1],
   [1,1],
   [1,2,1],
   [1,3,3,1],
   [1,4,6,4,1]
   ]
*/
public class Solution
{
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 1){
            List<List<Integer>> list = new ArrayList<List<Integer>>();
            List<Integer> l = new ArrayList<Integer>();
            if (numRows == 1){
                l.add(1);
                list.add(l);
            }
            return list;
        } else {
            List<List<Integer>> prelist = generate(numRows - 1);
            List<Integer> pl = prelist.get(numRows - 2);
            List<Integer> l = new ArrayList<Integer>();

            l.add(1);
            if (pl.size() > 1){
                for (int i = 1; i < pl.size(); i++) {
                    l.add(pl.get(i - 1) + pl.get(i));
                }
            }
            l.add(1);
            prelist.add(l);
            return prelist;
        }
    }
}
