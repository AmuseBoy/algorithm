package com.amuse.algorithm.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName CreateTargetArray_1389
 * @Description 按既定顺序创建目标数组
 * @Author 刘培振
 * @Date 2021-02-11 15:57
 * @Version 1.0
 */
public class CreateTargetArray_1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i ++){
            int j = index[i];
            list.add(j, nums[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        CreateTargetArray_1389 createTargetArray_1389 = new CreateTargetArray_1389();
        int[] target = createTargetArray_1389.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1});
        System.out.println(Arrays.toString(target));

    }
}
