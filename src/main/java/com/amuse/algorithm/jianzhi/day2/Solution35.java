package com.amuse.algorithm.jianzhi.day2;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName 剑指 Offer 35. 复杂链表的复制
 * @Description 第一版面试题26
 * @Author 刘培振
 * @Date 2021-11-23 18:32
 * @Version 1.0
 */
public class Solution35 {


//    public Node copyRandomList(Node head) {
//        Map<Node, Node> map = new HashMap<>();
//        Node cur = head;
//        while (cur != null) {
//            map.put(cur, new Node(cur.val));
//            cur = cur.next;
//        }
//        cur = head;
//        while (cur != null) {
//            map.get(cur).next = map.get(cur.next);
//            map.get(cur).random = map.get(cur.random);
//            cur = cur.next;
//        }
//        return map.get(head);
//    }

    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        Node cur = head;
        while (cur != null) {
            Node newNode = new Node(cur.val);
            newNode.next = cur.next;
            cur.next = newNode;
            cur = newNode.next;
        }
        cur = head;
        while (cur != null) {
            if(cur.random != null){
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        cur = head.next;
        Node pre = head;
        Node res = head.next;
        while (cur.next != null) {
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null;
        return res;
    }

}


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

