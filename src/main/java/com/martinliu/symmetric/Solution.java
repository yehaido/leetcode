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
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    // recursive version
    public boolean isSymmetric(TreeNode left, TreeNode right){
        if (left == right){
            return true;
        } else if (left != null && right != null && left.val == right.val){
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        } else {
            return false;
        }
    }

    // iterated version
    public boolean isSymmetricIt(TreeNode root){
        if (root == null) return true;

        List<TreeNode> nodes = new ArrayList<TreeNode>();
        nodes.add(root.left);
        nodes.add(root.right);

        while (nodes.size() > 0){
            List<TreeNode> tmpNodes = new ArrayList<TreeNode>();
            int size = nodes.size();
            if (size % 2 != 0){
                return false;
            }
            for (int i = 0; i < size; i++){
                TreeNode node = nodes.get(i);
                TreeNode nodeR = nodes.get(size - i - 1);
                int val = 0, valR = 0;
                if (node != null){
                    val = node.val;
                }
                if (nodeR != null){
                    valR = nodeR.val;
                }
                if (val != valR){
                    return false;
                }

                if (node != null && nodeR != null && node.val != nodeR.val){

                }
                if (node != null){
                    tmpNodes.add(node.left);
                }
                if (node != null) {
                    tmpNodes.add(node.right);
                }
            }
            nodes = tmpNodes;
        }
        return true;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        this.val = x;
    }
}
