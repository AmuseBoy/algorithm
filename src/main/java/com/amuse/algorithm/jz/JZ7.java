package com.amuse.algorithm.jz;

/**
 * @ClassName JZ7
 * @Description  斐波那契数列
 * @Author 刘培振
 * @Date 2021-06-28 20:35
 * @Version 1.0
 */
public class JZ7 {

    private int count = 0;

    //递归法
//    public int Fibonacci(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        count++;
//        return Fibonacci(n - 1) + Fibonacci(n - 2);
//    }

    //动态
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int one = 0;
        int two = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }




    public static void main(String[] args) {
        JZ7 jz7 = new JZ7();
        int n = jz7.Fibonacci(45);
        System.out.println(n);
        System.out.println(jz7.count);
    }
}
