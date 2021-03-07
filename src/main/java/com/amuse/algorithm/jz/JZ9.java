package com.amuse.algorithm.jz;

/**
 * @description: 变态跳台阶
 * @projectName: algorithm
 * @see: com.amuse.algorithm.jz
 * @author: 刘培振
 * @createTime: 2021/3/6 17:02
 * @version:1.0
 */
public class JZ9 {

    public int jumpFloorII(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        int fi = 1;
        for (int i = 2; i <= target; i++) {
            fi = 2 * fi;
        }
        return fi;
    }

    public static void main(String[] args) {
        JZ9 jz9 = new JZ9();
        int s = jz9.jumpFloorII(4);
        System.out.println(s);
    }
}
