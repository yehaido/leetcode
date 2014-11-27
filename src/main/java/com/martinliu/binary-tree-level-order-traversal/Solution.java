package com.martinliu.levelorder;
import java.util.*;

/**
   Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

   For example:
   Given binary tree {3,9,20,#,#,15,7},
   3
   / \
   9  20
   /  \
   15   7
   return its level order traversal as:
   [
   [3],
   [9,20],
   [15,7]
   ]
*/
public class Solution
{
    public List<List<Integer>> levelOrder(TreeNode root) {
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
