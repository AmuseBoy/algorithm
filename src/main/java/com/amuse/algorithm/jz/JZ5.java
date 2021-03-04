package com.amuse.algorithm.jz;

import java.util.Stack;

/**
 * @ClassName JZ5
 * @Description 用两个栈实现队列
 * @Author 刘培振
 * @Date 2021-03-03 16:58
 * @Version 1.0
 */
public class JZ5 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int size = stack1.size();
        if (stack2.isEmpty()) {
            for (int i = 0; i < size; i++) {
                int node = stack1.pop();
                stack2.push(node);
            }
            if (stack2.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            } else {
                return stack2.pop();
            }
        } else {
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        JZ5 jz5 = new JZ5();
        jz5.push(1);
        jz5.push(2);
        jz5.push(3);
        System.out.println(jz5.pop());
        System.out.println(jz5.pop());
        jz5.push(4);
        System.out.println(jz5.pop());
        jz5.push(5);
        System.out.println(jz5.pop());
        System.out.println(jz5.pop());


    }
}
