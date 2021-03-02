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
        ListNode listNode = new ListNode(33);
        listNode.next = new ListNode(44);
        JZ3 jz3 = new JZ3();
        ArrayList<Integer> list = jz3.printListFromTailToHead(listNode);
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





