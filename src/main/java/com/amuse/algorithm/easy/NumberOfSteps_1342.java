package com.amuse.algorithm.easy;

/**
 * @ClassName NumberOfSteps_1342
 * @Description 将数字变成 0 的操作次数
 * @Author 刘培振
 * @Date 2021-02-01 19:46
 * @Version 1.0
 */
public class NumberOfSteps_1342 {

    public int numberOfSteps(int num) {
        int sum = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                sum++;
            } else {
                num = num - 1;
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        NumberOfSteps_1342 numberOfSteps_1342 = new NumberOfSteps_1342();
        System.out.println(numberOfSteps_1342.numberOfSteps(8));
    }
}
