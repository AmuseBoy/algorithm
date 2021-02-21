package com.amuse.algorithm.easy;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName NumIdenticalPairs_1512
 * @Description 好数对的数目
 * @Author 刘培振
 * @Date 2021-01-29 17:02
 * @Version 1.0
 */
public class NumIdenticalPairs_1512 {

    public int numIdenticalPairs(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int v = entry.getValue();
            sum = sum + v *(v-1)/2;
        }
        return sum;
    }

    public static void main(String[] args) {
        NumIdenticalPairs_1512 numIdenticalPairs_1512 = new NumIdenticalPairs_1512();
        int sum = numIdenticalPairs_1512.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3});
//        int sum = numIdenticalPairs_1512.numIdenticalPairs(new int[]{1, 1, 1, 1});
        System.out.println(sum);
    }
}
