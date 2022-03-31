package com.amuse.algorithm.jianzhi.day2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName 剑指 Offer 06. 从尾到头打印链表
 * @Description 第一版面试题5
 * @Author 刘培振
 * @Date 2021-11-23 10:26
 * @Version 1.0
 */
public class Solution06 {

//    public int[] reversePrint(ListNode head) {
//        Stack<Integer> stack = new Stack<>();
//        while (null != head) {
//            stack.push(head.val);
//            head = head.next;
//        }
//        int[] res = new int[stack.size()];
//        for (int i = 0; !stack.empty(); i++) {
//            res[i] = stack.pop();
//        }
//        return res;
//    }

    int[] arr;
    int count = 0;

    public int[] reversePrint(ListNode head) {

        recursion(head, 0);
        return arr;
    }


    private void recursion(ListNode node, int index){
        if(node == null){
            arr = new int[count];
            return;
        }
        count ++;
        recursion(node.next, index + 1);
        arr[count-index-1] = node.val;
    }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(8);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        Solution06 solution = new Solution06();
        System.out.println(Arrays.toString(solution.reversePrint(listNode1)));
    }

}



class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

