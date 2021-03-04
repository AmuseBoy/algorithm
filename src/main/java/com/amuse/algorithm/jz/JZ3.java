package com.amuse.algorithm.jz;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName JZ3
 * @Description 从尾到头打印链表
 * @Author 刘培振
 * @Date 2021-03-02 17:49
 * @Version 1.0
 */
public class JZ3 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null){
            list.add(0, listNode.val);
            listNode = listNode.next;
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(33);
        ListNode listNode2 = new ListNode(44);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(22);
        listNode2.next = listNode3;
        ListNode listNode4 = new ListNode(89);
        listNode3.next = listNode4;
        JZ3 jz3 = new JZ3();
        ArrayList<Integer> list = jz3.printListFromTailToHead(listNode1);
        System.out.println(list.toString());
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}





