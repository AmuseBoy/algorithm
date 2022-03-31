package com.amuse.algorithm.jz;

/**
 * @ClassName LiKou18
 * @Description TODO
 * @Author 刘培振
 * @Date 2021-07-01 20:24
 * @Version 1.0
 */
public class LiKou18 {


    public ListNode18 deleteNode(ListNode18 head, int val){
        if(head == null)
            return null;
        if(head.val == val){
            return head.next;
        }
        ListNode18 node18 = head;
        while (head.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
                break;
            }
            node18 = head.next;
        }
        return head;
    }

}


class ListNode18{
    int val;
    ListNode18 next;

    ListNode18(int x) {
        val = x;
    }
}