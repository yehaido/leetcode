package com.martinliu.mediansortedarrays;

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
        Solution s = new Solution();
        int[] A = {};
        int[] B = {2,3};
        int[] C = {1, 5, 10, 15};
        int[] D = {2, 3, 9, 17};

        assertTrue(2.5 == s.findMedianSortedArrays(A, B));
        assertTrue(7.0 == s.findMedianSortedArrays(C, D));
    }
}
