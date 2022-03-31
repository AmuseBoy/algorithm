package com.amuse.algorithm.jianzhi.day2;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName 剑指 Offer 24. 反转链表
 * @Description 第一版面试题16
 * @Author 刘培振
 * @Date 2021-11-23 14:58
 * @Version 1.0
 */
public class Solution24 {

//    public ListNode reverseList(ListNode head) {
//        ListNode pre = null;
//        ListNode cur = head;
//        ListNode next = null;
//        while (cur != null){
//            next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//        }
//        return pre;
//    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }



    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(8);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        Solution24 solution = new Solution24();
        System.out.println(solution.reverseList(listNode1));
    }

}