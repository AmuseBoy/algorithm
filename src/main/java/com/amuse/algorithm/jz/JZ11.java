package com.amuse.algorithm.jz;

/**
 * @ClassName JZ11
 * @Description 二进制中1的个数
 * @Author 刘培振
 * @Date 2021-06-29 17:57
 * @Version 1.0
 */
public class JZ11 {

/*    public int NumberOf1(int n) {
        int sum = 0;
        while (n  != 0 ){
            if((n&1) ==1){
                sum ++;
            }
            n = n>>1;
        }
        return sum;
    }*/

    //通过移动标志位来进行统计
/*
    public int NumberOf1(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }
*/

    //-2147483648 再减 1 = 2147483647， 而且： -2147483648 & 2147483647 = 0
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            System.out.println("B" + n);
            n = n & (n - 1);
            System.out.println("A"  +n);
            count ++;
        }
        return count;
    }





    public static void main(String[] args) {
        System.out.println(new JZ11().NumberOf1(-10));
        //System.out.println(-10>>1);
        //System.out.println(Integer.MIN_VALUE -1);
    }
}
