package com.martinliu.mediansortedarrays;
import java.util.*;

/**
   There are two sorted arrays A and B of size m and n respectively.
   Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
*/
public class Solution
{
    public double findMedianSortedArrays(int A[], int B[]) {
        int lenA = A.length;
        int lenB = B.length;
        int sum = lenA + lenB;

        int i = (sum + 1)/2;
        int[] union = new int[i + 1];
        int iA = 0, iB = 0;
        while (iA + iB < i + 1){
            if (iA == lenA && iB == lenB){
                break;
            } else if (iA == lenA){
                union[iA + iB] = B[iB];
                iB++;
            } else if (iB == lenB){
                union[iA + iB] = A[iA];
                iA++;
            } else if (A[iA] <= B[iB]){
                union[iA + iB] = A[iA];
                iA++;
            } else {
                union[iA + iB] = B[iB];
                iB++;
            }
        }


        if (sum % 2 == 0){
            // even
            return ((double)union[i - 1] + (double)union[i])/2;
        } else {
            // odd
            return union[i - 1];
        }
    }
}
