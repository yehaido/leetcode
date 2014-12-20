package com.martinliu.linkedlistcycle;
import java.util.*;

/**
   Given a linked list, determine if it has a cycle in it.

   Follow up:
   Can you solve it without using extra space?
*/
public class Solution
{
    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        } else {
            Map<ListNode, Boolean> map = new HashMap<ListNode, Boolean>();
            ListNode curr = head;
            while (curr != null){
                if (map.get(curr) != null){
                    return true;
                } else {
                    map.put(curr, Boolean.TRUE);
                    curr = curr.next;
                }
            }
            return false;
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
