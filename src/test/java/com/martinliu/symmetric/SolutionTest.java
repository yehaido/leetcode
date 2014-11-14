package com.martinliu.symmetric;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Unit test for Solution.
 */
public class SolutionTest {
    @Test
    public void test()
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Solution solution = new Solution();
        assertTrue(solution.isSymmetric(root));
        assertTrue(solution.isSymmetricIt(root));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        assertFalse(solution.isSymmetric(root2));
        assertFalse(solution.isSymmetricIt(root2));
    }
}
