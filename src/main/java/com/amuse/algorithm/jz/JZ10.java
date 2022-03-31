package com.amuse.algorithm.jz;

/**
 * @ClassName JZ10
 * @Description 矩形覆盖
 * @Author 刘培振
 * @Date 2021-06-29 17:36
 * @Version 1.0
 */
public class JZ10 {

    public int rectCover(int target) {
        if (target == 1 || target == 2) {
            return target;
        }
        int one = 1;
        int two = 2;
        int sum = 0;
        for (int i = 3; i <= target; i++) {
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }


    public static void main(String[] args) {
        JZ10 jz10 = new JZ10();
        int sum = jz10.rectCover(8);
        System.out.println(sum);

    }
}
