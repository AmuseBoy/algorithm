package com.amuse.algorithm.easy;

/**
 * @ClassName DeleteNode_237
 * @Description 删除链表中的节点
 * @Author 刘培振
 * @Date 2021-02-11 13:13
 * @Version 1.0
 */
public class DeleteNode_237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
