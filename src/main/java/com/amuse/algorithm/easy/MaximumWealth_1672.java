package com.amuse.algorithm.easy;

/**
 * @ClassName MaximumWealth
 * @Description 最富有客户的资产总量
 * @Author 刘培振
 * @Date 2021-01-27 17:01
 * @Version 1.0
 */
public class MaximumWealth_1672 {

    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp = temp + accounts[i][j];
            }
            sum = Math.max(sum, temp);
        }
        return sum;
    }

    public static void main(String[] args) {
        MaximumWealth_1672 maximumWealth_1672 = new MaximumWealth_1672();
        int sum = maximumWealth_1672.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}});
        System.out.println(sum);
    }
}
