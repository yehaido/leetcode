package com.martinliu.pathsum;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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
        Solution solution = new Solution();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        assertTrue(solution.hasPathSum(root, 6));
    }
}
