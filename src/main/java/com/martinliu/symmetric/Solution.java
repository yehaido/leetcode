package com.martinliu.symmetric;
import java.util.*;

/**
   Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

   For example, this binary tree is symmetric:
        1
       / \
      2   2
     / \ / \
    3  4 4  3
   But the following is not:
    1
   / \
  2   2
   \   \
   3    3

       1
      / \
     2   3
        /
       4
        \
         5
   The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".

*/
public class Solution
{
    public boolean isSymmetric(TreeNode root) {
        boolean bool = false;
        if ()

        return bool;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        this.val = x;
    }

    public static TreeNode parse(Object[] serial){
        TreeNode root = null;
        TreeNode curr = null;
        for (int i = 0; i < serial.length; i = i + 2){
            try {
                if (d == 0){
                    root = new TreeNode(serial[i]);
                } else {
                    int valLeft = (int)serial[i - 1];
                    int valRight = (int)serial[i];
                    curr.left = new TreeNode(valLeft);
                    curr.right = new TreeNode(valRight);
                }
            }
            catch (Throwable e) {

                continue;
            }
        }
    }
}
