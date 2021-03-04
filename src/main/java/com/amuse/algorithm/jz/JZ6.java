package com.amuse.algorithm.jz;

/**
 * @ClassName JZ6
 * @Description 旋转数组的最小数字
 * @Author 刘培振
 * @Date 2021-03-03 18:55
 * @Version 1.0
 */
public class JZ6 {

    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        while (array[left] >= array[right]) {
            int mid = (left + right) / 2;
            if (array[mid] < array[right]) {
                right = mid;
            }
            if (array[mid] >= array[left]) {
                left = mid;
            }
            if (right - left == 1) {
                return array[right];
            }
        }
        return array[left];
    }


    public static void main(String[] args) {
        //int[] array = {3, 4, 5, 6, 1, 2};
        //int[] array = {4, 5, 1, 2, 3};
        //int[] array = {1, 2, 3, 4, 5};
        int[] array = {1,1,1,0,1};
        //int[] array = {6,7,1,2,3,4,5};
        JZ6 jz6 = new JZ6();
        int k = jz6.minNumberInRotateArray(array);
        System.out.println(k);

    }

}
