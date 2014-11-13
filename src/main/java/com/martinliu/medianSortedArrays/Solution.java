package com.martinliu.mediansortedarrays;
import java.util.*;

/**
   There are two sorted arrays A and B of size m and n respectively.
   Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
*/
public class Solution
{
    public double findMedianSortedArrays(int A[], int B[]) {
        int ret = 0;
        int lenA = A.length;
        int lenB = B.length;

        int iA = (lenA + 1)/2;
        int iB = (lenB + 1)/2;

        while (!stop(iA, iB)){
            if (A[iA] == B[iB]){
                ret = A[iA];
            } else if (A[iA] > B[iB]){
                iA = stepBack(A);
                iB = stepOver(B);
            } else {
                iA = stepOver(A);
                iB = stepBack(B);
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

    private boolean stop(int[] A, int[] B){

    }

    private boolean stepOver(int[] array){
        (iA + iB + 1)/2
            }

    private boolean stepBack(int[] array){
        (iA + iB - 1)/2
            }

    private class Step{
        int left;
        int right;
        int curr;

        Step(int left, int right){
            this.left = left;
            this.right = right;
            this.curr = (this.left + this.right + 1)/2;
        }

        void stepOver(){
            this.left = this.curr;
            this.curr = (this.left + this.right + 1)/2;
        }

        void stepBack(){
            this.right = this.curr;
            this.curr = (this.left + this.right)/2;
        }

        void isDone(){

        }
    }
}
