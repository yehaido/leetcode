package com.martinliu.removenthnodefromendoflist;
import java.util.*;

/**
   Given a linked list, remove the nth node from the end of list and return its head.

   For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
   Note:
   Given n will always be valid.
   Try to do this in one pass.
*/
public class Solution
{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null){
            return null;
        }
        ListNode curr = head;
        ListNode currStop = head;
        for (int i = 1; i <= n; i++) {
            // when no currStop, it's not removing any node
            if (currStop == null){
                return head;
            }
            currStop = currStop.next;
        }

        if (currStop != null){
            while (currStop.next != null){
                curr = curr.next;
                currStop = currStop.next;
            }

            curr.next = curr.next.next;
            return head;
        } else {
            return head.next;
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
