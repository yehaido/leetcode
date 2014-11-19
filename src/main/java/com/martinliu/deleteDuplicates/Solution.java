package com.martinliu.deleteduplicate;
import java.util.*;

/**
   Given a sorted linked list, delete all duplicates such that each element appear only once.

   For example,
   Given 1->1->2, return 1->2.
   Given 1->1->2->3->3, return 1->2->3.
*/
public class Solution
{
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        ListNode curr = head;
        map.put(curr.val, Boolean.TRUE);
        while (curr != null && curr.next != null){
            if (map.get(curr.next.val) != null){
                curr.next = curr.next.next;
            } else {
                map.put(curr.next.val, Boolean.TRUE);
                curr = curr.next;
            }
        }
        return head;
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
