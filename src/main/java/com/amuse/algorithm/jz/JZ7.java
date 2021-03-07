package com.amuse.algorithm.jz;

/**
 * @description: 斐波那契数列
 * @projectName: algorithm
 * @see: com.amuse.algorithm.jz
 * @author: 刘培振
 * @createTime: 2021/3/5 21:30
 * @version: 1.0
 */
public class JZ7 {

//    //递归算法
//    public int Fibonacci(int n) {
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        } else {
//            return Fibonacci(n - 1) + Fibonacci(n - 2);
//        }
//    }

    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int f1 = 0;
        int f2 = 1;
        int fn = 0;
        for (int i = 2; i <= n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }

    public static void main(String[] args) {
        JZ7 jz7 = new JZ7();
        int s = jz7.Fibonacci(2);
        System.out.println(s);
    }

}
