package com.amuse.algorithm.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName RemoveDuplicates_26
 * @Description 删除排序数组中的重复项
 * @Author 刘培振
 * @Date 2021-02-24 19:04
 * @Version 1.0
 */
public class RemoveDuplicates_26 {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


    public static void main(String[] args) {
        RemoveDuplicates_26 removeDuplicates_26 = new RemoveDuplicates_26();
        int res = removeDuplicates_26.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        System.out.printf(res + "");
    }
}
