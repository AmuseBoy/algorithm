package com.amuse.algorithm.easy;

import java.util.Arrays;

/**
 * @ClassName RunningSumOf1dArray
 * @Description 一维数组的动态和
 * @Author 刘培振
 * @Date 2021-01-27 15:39
 * @Version 1.0
 */
public class RunningSumOf1dArray_1480 {

    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for(int i = 1; i< nums.length; i++){
            sums[i] = sums[i-1] + nums[i];
        }
        return sums;
    }

    public static void main(String[] args) {
        RunningSumOf1dArray_1480 runningSumOf1DArray1480 = new RunningSumOf1dArray_1480();
        int[] sums = runningSumOf1DArray1480.runningSum(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(sums));
//        System.out.println(Arrays.toString(new int[3]));

    }
}
