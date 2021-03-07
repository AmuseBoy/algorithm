package com.amuse.algorithm.jz;

/**
 * @description: 跳台阶
 * @projectName: algorithm
 * @see: com.amuse.algorithm.jz
 * @author: 刘培振
 * @createTime: 2021/3/6 16:46
 * @version:1.0
 */
public class JZ8 {

    public int jumpFloor(int target) {
        if (target == 0) {
            return 0;
        }
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
        JZ8 jz8 = new JZ8();
        int s = jz8.jumpFloor(4);
        System.out.println(s);
    }
}
