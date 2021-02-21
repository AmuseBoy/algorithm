package com.amuse.algorithm.easy;

/**
 * @ClassName FindKthPositive_1539
 * @Description 第 k 个缺失的正整数
 * @Author 刘培振
 * @Date 2021-02-11 16:56
 * @Version 1.0
 */
public class FindKthPositive_1539 {

    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        for ( i = 0; i< arr.length; i ++){
            int num = arr[i] -i -1;
            if(num >= k){
                return k + i;
            }
        }
        return k + i;
    }

    public static void main(String[] args) {
        FindKthPositive_1539 findKthPositive_1539 = new FindKthPositive_1539();
        int num = findKthPositive_1539.findKthPositive(new int[]{1,2,3,4}, 2);
        System.out.println(num);
    }
}
