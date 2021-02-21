package com.amuse.algorithm.easy;

/**
 * @ClassName NumberOfMatches_1688
 * @Description 比赛中的配对次数
 * @Author 刘培振
 * @Date 2021-02-01 19:37
 * @Version 1.0
 */
public class NumberOfMatches_1688 {

    public int numberOfMatches(int n) {
        int sum = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                sum = sum + n / 2;
                n = n / 2;
            } else {
                sum = sum + (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        NumberOfMatches_1688 numberOfMatches_1688 = new NumberOfMatches_1688();
        int sum = numberOfMatches_1688.numberOfMatches(7);
        System.out.println(sum);
    }
}
