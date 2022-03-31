package com.amuse.algorithm.jianzhi.day1;

import java.util.Stack;

/**
 * @ClassName 剑指 Offer 09. 用两个栈实现队列
 * @Description 第一版面试题7
 * @Author 刘培振
 * @Date 2021-11-22 19:03
 * @Version 1.0
 */
public class CQueue {

    Stack<Integer> stack1 = new Stack<>();//压入
    Stack<Integer> stack2 = new Stack<>();//压出

    public CQueue() {

    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.empty()) {
            return -1;
        } else {
            return stack2.pop();
        }
    }


    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        cQueue.appendTail(1);
        System.out.println(cQueue.deleteHead());
    }
}
