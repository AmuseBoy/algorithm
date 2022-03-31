package com.amuse.algorithm.jianzhi.day1;

import java.util.Stack;

/**
 * @ClassName 剑指 Offer 30. 包含min函数的栈
 * @Description 第一版面试题21
 * @Author 刘培振
 * @Date 2021-11-22 19:33
 * @Version 1.0
 */
public class MinStack {

    Stack<Integer> stack1 = new Stack<>();//主栈
    Stack<Integer> stack2 = new Stack<>();//辅助栈

    public MinStack() {

    }

    public void push(int x) {
        if (stack1.empty()) {
            stack2.push(x);
        } else {
            int k = stack2.peek();
            stack2.push(Math.min(x, k));
        }
        stack1.push(x);
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }


    public static void main(String[] args) {

    }
}
