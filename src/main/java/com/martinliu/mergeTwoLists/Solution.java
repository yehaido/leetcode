package com.martinliu.mergetwolists;
import java.util.*;

/**
   Given a binary tree, find its maximum depth.

   The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/
public class Solution
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode n = new ListNode(0);
        ListNode curr = n;
        while (l1 != null || l2 != null){
            if (l1 == null){
                curr.next = l2;
                break;
            } else if (l2 == null){
                curr.next = l1;
                break;
            } else {
                if (l1.val > l2.val){
                    curr.next = new ListNode(l2.val);
                    l2 = l2.next;
                } else {
                    curr.next = new ListNode(l1.val);
                    l1 = l1.next;
                }
                curr = curr.next;
            }

        }
        return n.next;
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
