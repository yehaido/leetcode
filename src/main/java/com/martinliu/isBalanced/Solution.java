package com.martinliu.isbalanced;
import java.util.*;

/**
   Given a binary tree, determine if it is height-balanced.

   For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
*/
public class Solution
{
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        } else {
            int differ = Math.abs(maxDepth(root.left) - maxDepth(root.right));
            return differ <=1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
