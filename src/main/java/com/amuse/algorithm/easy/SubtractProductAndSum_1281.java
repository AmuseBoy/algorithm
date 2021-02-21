package com.amuse.algorithm.easy;

/**
 * @ClassName SubtractProductAndSum_1281
 * @Description 整数的各位积和之差
 * @Author 刘培振
 * @Date 2021-02-02 19:37
 * @Version 1.0
 */
public class SubtractProductAndSum_1281 {

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n != 0) {
            product = product * (n % 10);
            sum = sum + n % 10;
            n = n / 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        SubtractProductAndSum_1281 subtractProductAndSum_1281 = new SubtractProductAndSum_1281();
        int res = subtractProductAndSum_1281.subtractProductAndSum(234);
        System.out.println(res);
    }
}
