package com.martinliu.twosum;

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
    public void twoSum()
    {
        Solution s = new Solution();
        int[] input = {2, 7, 11, 15};

        assertArrayEquals(new int[]{1, 2}, s.twoSum(input, 9));
        assertArrayEquals(new int[]{1, 3}, s.twoSum(input, 13));
        assertArrayEquals(new int[]{1, 4}, s.twoSum(input, 17));
        assertArrayEquals(new int[]{2, 3}, s.twoSum(input, 18));
        assertArrayEquals(new int[]{2, 4}, s.twoSum(input, 22));
        assertArrayEquals(new int[]{3, 4}, s.twoSum(input, 26));
    }
}
