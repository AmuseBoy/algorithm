package com.amuse.algorithm.jz;

/**
 * @ClassName JZ1
 * @Description 二维数组中的查找
 * @Author 刘培振
 * @Date 2021-02-26 17:31
 * @Version 1.0
 */
public class JZ1 {

    public boolean Find(int target, int[][] array) {
        int rows = 0;
        int cols = array[0].length - 1;
        for (int i = 0; i < (array[0].length + array.length - 1); i++) {
            System.out.println(rows + " " + cols);
            if (target < array[rows][cols] && cols > 0) {
                cols--;
            }
            if (target == array[rows][cols]) {
                return true;
            }
            if (target > array[rows][cols] && rows < array.length - 1) {
                rows++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        JZ1 jz1 = new JZ1();
        boolean b = jz1.Find(14, new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}});
        System.out.println(b);
    }
}
