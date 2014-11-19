package com.martinliu.numtrees;
import java.util.*;

/**
   Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

   For example,
   Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3

*/
public class Solution
{
    public int numTrees(int n) {
        if (n < 1){
            return 0;
        } else if (n == 1){
            return 1;
        } else if (n == 2){
            return 2;
        } else {
            return 2 * numTrees(n - 1) + 1;
        }
    }
}
