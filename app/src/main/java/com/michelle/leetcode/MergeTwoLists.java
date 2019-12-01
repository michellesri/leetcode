package com.michelle.leetcode;

import java.util.List;

public class MergeTwoLists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode beginning = null;
        ListNode whereToAdd = null;

        if (l1 == null) {
            return l2;
        } else if (l2 == null){
            return l1;
        }

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                if (beginning == null) {
                    beginning = l1;
                    whereToAdd = l1;
                } else {
                    whereToAdd.next = l1;
                    whereToAdd = whereToAdd.next;
                }
                l1 = l1.next;
            } else {
                if (beginning == null) {
                    beginning = l2;
                    whereToAdd = l2;
                } else {
                    whereToAdd.next = l2;
                    whereToAdd = whereToAdd.next;
                }
                l2 = l2.next;
            }
        }

        if (l1 == null) {
            whereToAdd.next = l2;
        } else {
            whereToAdd.next = l1;
        }
        return beginning;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
