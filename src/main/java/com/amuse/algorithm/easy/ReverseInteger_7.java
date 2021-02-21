package com.amuse.algorithm.easy;

/**
 * @ClassName ReverseInteger
 * @Description 整数反转
 * @Author 刘培振
 * @Date 2021-01-27 10:54
 * @Version 1.0
 */
public class ReverseInteger_7 {

//    public int reverse(int x) {
//        int i;
//        try {
//            StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(x)));
//            sb.reverse();
//
//            i = Integer.valueOf(sb.toString());
//            if (x < 0) {
//                return -i;
//            }
//        } catch (Exception e) {
//            return 0;
//        }
//        return i;
//    }

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            if (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        ReverseInteger_7 reverseInteger7 = new ReverseInteger_7();
        System.out.println(reverseInteger7.reverse(-153423646));
    }


}
