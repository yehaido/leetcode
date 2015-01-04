package com.martinliu.addtwonumbers;
import java.util.*;

/**
   You are given two linked lists representing two non-negative numbers.
   The digits are stored in reverse order and each of their nodes contain a single digit.
   Add the two numbers and return it as a linked list.

   Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
   Output: 7 -> 0 -> 8
*/
public class Solution
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        } else if (l2 == null){
            return l1;
        } else {
            ListNode curr1 = l1;
            ListNode curr2 = l2;
            int carry = 0;
            int sum = 0;

            ListNode ret = null;
            ListNode curr = null;

            while (!isDone(curr1, curr2, carry)){
                sum = getSum(curr1, curr2, carry);
                // check carry
                carry = sum / 10;
                // sum without carry
                sum = sum % 10;

                ListNode n = new ListNode(sum);

                if (curr == null){
                    // initial
                    curr = n;
                    ret = curr;
                } else {
                    curr.next = n;
                    curr = curr.next;
                }
                if (curr1 != null){
                    curr1 = curr1.next;
                }
                if (curr2 != null){
                    curr2 = curr2.next;
                }
            }

            return ret;
        }
    }

    private boolean isDone(ListNode curr1, ListNode curr2, int carry){
        return curr1 == null && curr2 == null && carry == 0;
    }

    private int getSum(ListNode curr1, ListNode curr2, int carry){
        int sum = 0;
        // add vals and carry
        if (curr1 != null){
            sum += curr1.val;
        }
        if (curr2 != null){
            sum += curr2.val;
        }
        sum += carry;
        return sum;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
