package com.amuse.algorithm.jz;

/**
 * @ClassName JZ9
 * @Description 跳台阶扩展问题
 * @Author 刘培振
 * @Date 2021-06-29 9:53
 * @Version 1.0
 */
public class JZ9 {


    /**
     * f(n)= 2^(n-1)
     * f(n) = 2f(n-1)
     */


    public int jumpFloorII(int target) {
        int one = 1;
        int sum = 0;
        for (int i = 2; i <= target; i++) {
            sum = 2 * one;
            one = sum;
        }
        return sum;
    }


//    public int jumpFloorII(int target) {
//        return 2<<(target -1 -1);
//    }


    public static void main(String[] args) {
        JZ9 jz9 = new JZ9();
        int n= jz9.jumpFloorII(3);
        System.out.println(n);
        System.out.println(2<<1);
    }

}
