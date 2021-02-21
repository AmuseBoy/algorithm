package com.amuse.algorithm.easy;

import java.util.Arrays;

/**
 * @ClassName Shuffle_1470
 * @Description 重新排列数组
 * @Author 刘培振
 * @Date 2021-02-01 18:49
 * @Version 1.0
 */
public class Shuffle_1470 {

    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[i * 2] = nums[i];
            res[i * 2 + 1] = nums[n + i];
        }
        return res;
    }


    public static void main(String[] args) {
        Shuffle_1470 shuffle_1470 = new Shuffle_1470();
        int[] res = shuffle_1470.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        System.out.println(Arrays.toString(res));

    }
}
