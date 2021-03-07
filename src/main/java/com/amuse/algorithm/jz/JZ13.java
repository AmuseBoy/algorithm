package com.amuse.algorithm.jz;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description: 调整数组顺序使奇数位于偶数前面
 * @projectName: algorithm
 * @see: com.amuse.algorithm.jz
 * @author: 刘培振
 * @createTime: 2021/3/7 12:14
 * @version:1.0
 */
public class JZ13 {

    public int[] reOrderArray (int[] array) {
        if (array.length == 0) {
            return array;
        }
        Queue<Integer> odd = new LinkedList<>();
        Queue<Integer> even = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 0) {
                even.add(array[i]);
            } else {
                odd.add(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(!odd.isEmpty()){
                array[i] = odd.poll();
            }else{
                array[i] = even.poll();
            }
        }
        return array;
    }




    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        JZ13 jz13 = new JZ13();
        int[] result = jz13.reOrderArray(array);
        System.out.println(Arrays.toString(result));
    }
}
