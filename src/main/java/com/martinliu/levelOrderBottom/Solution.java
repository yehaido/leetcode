package com.martinliu.levelorderbottom;
import java.util.*;

/**
   Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

   For example:
   Given binary tree {3,9,20,#,#,15,7},
   3
   / \
   9  20
   /  \
   15   7
   return its bottom-up level order traversal as:
   [
   [15,7],
   [9,20],
   [3]
   ]
*/
public class Solution
{
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (root != null){
            List<TreeNode> arr = new ArrayList<TreeNode>();
            arr.add(root);
            while (arr.size() != 0){
                List<TreeNode> tmp = new ArrayList<TreeNode>();
                List<Integer> l = new ArrayList<Integer>();
                for (TreeNode node : arr) {
                    l.add(node.val);

                    if (node.left != null){
                        tmp.add(node.left);
                    }
                    if (node.right != null){
                        tmp.add(node.right);
                    }
                }
                list.add(l);
                arr = tmp;
            }
            Collections.reverse(list);
        }
        return list;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
