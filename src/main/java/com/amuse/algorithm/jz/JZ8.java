package com.amuse.algorithm.jz;

/**
 * @ClassName JZ8
 * @Description 跳台阶
 * @Author 刘培振
 * @Date 2021-06-28 21:47
 * @Version 1.0
 */
public class JZ8 {

    // f(n) = f(n-1) + f(n-2)

//    public int jumpFloor(int target) {
//        if (target <= 0) {
//            return 0;
//        }
//        if (target == 1) {
//            return 1;
//        }
//        if (target == 2) {
//            return 2;
//        }
//        return jumpFloor(target - 1) + jumpFloor(target - 2);
//    }

    public int jumpFloor(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int one = 1;
        int two = 2;
        int sum = 0;
        for (int i = 3; i <= target; i++) {
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum ;
    }


    public static void main(String[] args) {
        JZ8 jz8 = new JZ8();
        System.out.println(jz8.jumpFloor(4));
    }
}
