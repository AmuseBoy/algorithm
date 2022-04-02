package com.amuse.algorithm.jianzhi.day1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName CStack
 * @Description 剑指 Offer 09:相关题目-用两个队列实现一个栈
 * @Author 刘培振
 * @Date 2022-04-02 14:12
 * @Version 1.0
 */
public class CStack {

    Queue<Integer> queue1 = null;
    Queue<Integer> queue2 = null;

    public CStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int value) {
        if (!queue1.isEmpty()) {
            queue1.offer(value);
        } else {
            queue2.offer(value);
        }
    }

    public int pop() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            return -1;
        }
        if (queue1.isEmpty()) {
            while (queue2.size() != 1) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        } else {
            while (queue1.size() != 1) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }
    }


    public static void main(String[] args) {
        CStack stack = new CStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
    }
}
