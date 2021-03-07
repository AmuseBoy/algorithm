package com.amuse.algorithm.jz;

/**
 * @description: 二进制中1的个数
 * @projectName: algorithm
 * @see: com.amuse.algorithm.jz
 * @author: 刘培振
 * @createTime: 2021/3/6 18:04
 * @version:1.0
 */
public class JZ11 {
    //无符号位右移
//    public int NumberOf1(int n) {
//        int count = 0;
//        while (n != 0) {
//            count = count + (n&1);
//            n = n>>>1;
//        }
//        return count;
//    }

//    public int NumberOf1(int n) {
//        int count = 0;
//        int flag = 1;
//        while (flag != 0) {
//            if ((n & flag) != 0) {
//                count ++;
//            }
//            flag = flag<<1;
//        }
//        return count;
//    }

    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count ++;
            n = n & (n - 1);
        }
        return count;
    }


    public static void main(String[] args) {
        JZ11 jz11 = new JZ11();
        int s = jz11.NumberOf1(-10);
        System.out.println(s);
    }
}
