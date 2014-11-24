package com.martinliu.mergesortedarray;
import java.util.*;

/**
   Given two sorted integer arrays A and B, merge B into A as one sorted array.

   Note:
   You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.
*/
public class Solution
{
    public void merge(int A[], int m, int B[], int n) {
        int currA = m - 1;
        int currB = n - 1;
        while (currA + currB >= -1){
            if (currA >= 0 && currB >= 0){
                if (A[currA] >= B[currB]){
                    A[currA + currB + 1] = A[currA];
                    currA--;
                } else {
                    A[currA + currB + 1] = B[currB];
                    currB--;
                }
            } else if (currB >= 0){
                A[currA + currB + 1] = B[currB];
                currB--;
            } else {
                A[currA + currB + 1] = A[currA];
                currA--;
            }
        }
    }
}
