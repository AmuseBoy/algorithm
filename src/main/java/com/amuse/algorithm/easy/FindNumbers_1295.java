package com.amuse.algorithm.easy;

/**
 * @ClassName FindNumbers_1295
 * @Description 统计位数为偶数的数字
 * @Author 刘培振
 * @Date 2021-02-01 19:29
 * @Version 1.0
 */
public class FindNumbers_1295 {

    public int findNumbers(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        FindNumbers_1295 findNumbers_1295 = new FindNumbers_1295();
        int nu = findNumbers_1295.findNumbers(new int[]{222, 3, 4, 6, 7, 0});
        System.out.println(nu);
    }
}
