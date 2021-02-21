package com.amuse.algorithm.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName twosum
 * @Description 两数之和
 * @Author 刘培振
 * @Date 2021-01-26 18:57
 * @Version 1.0
 */
public class TwoSum_1 {

//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 1; j < nums.length; j++) {
//                if (target == nums[i] + nums[j]) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[0];
//    }


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum_1 twoSum1 = new TwoSum_1();
        int[] nums = {3, 2, 3};
//        int[] nums = {2, 11, 15, 7};
        int[] res = twoSum1.twoSum(nums, 9);
        System.out.println(Arrays.toString(res));
    }
}
