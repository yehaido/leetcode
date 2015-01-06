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
        return doAdd(l1, l2, 0);
    }

    private ListNode doAdd(ListNode l1, ListNode l2, int carry){
        if (l1 == null){
            if (carry == 1){
                l2 = doAdd(new ListNode(1), l2, 0);
            }
            return l2;
        } else if (l2 == null){
            if (carry == 1){
                l1 = doAdd(l1, new ListNode(1), 0);
            }
            return l1;
        } else {
            int sum = l1.val + l2.val + carry;
            // check carry
            carry = sum / 10;
            // sum without carry
            sum = sum % 10;
            l1.val = sum;
            l1.next = doAdd(l1.next, l2.next, carry);
            return l1;
        }
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
