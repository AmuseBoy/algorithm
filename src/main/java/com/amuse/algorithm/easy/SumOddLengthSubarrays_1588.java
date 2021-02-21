package com.amuse.algorithm.easy;

/**
 * @ClassName SumOddLengthSubarrays
 * @Description 所有奇数长度子数组的和
 * @Author 刘培振
 * @Date 2021-02-02 17:24
 * @Version 1.0
 */
public class SumOddLengthSubarrays_1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int leftOdd = (i + 1) / 2;
            int leftEven = i / 2 + 1;
            int rightOdd = (len - i) / 2;
            int rightEven = (len - 1 - i) / 2 + 1;
            sum = sum + arr[i] * (leftOdd * rightOdd + leftEven * rightEven);
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOddLengthSubarrays_1588 sumOddLengthSubarrays_1588 = new SumOddLengthSubarrays_1588();
        int sum = sumOddLengthSubarrays_1588.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3});
        System.out.println(sum);
    }
}
