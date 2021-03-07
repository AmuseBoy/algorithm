package com.amuse.algorithm.jz;

/**
 * @description: 矩形覆盖
 * @projectName: algorithm
 * @see: com.amuse.algorithm.jz
 * @author: 刘培振
 * @createTime: 2021/3/6 17:25
 * @version:1.0
 */
public class JZ10 {

    public int rectCover(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int f1 = 1;
        int f2 = 2;
        int fn = 0;
        for (int i = 3; i <= target; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }

    public static void main(String[] args) {
        JZ10 jz10 = new JZ10();
        int s = jz10.rectCover(4);

        System.out.println(s);

    }
}
