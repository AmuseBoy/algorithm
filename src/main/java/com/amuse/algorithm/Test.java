package com.amuse.algorithm;

import java.util.ArrayList;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 刘培振
 * @Date 2021-02-25 17:34
 * @Version 1.0
 */
public class Test {


//    static long i,j = 0Xf000000000000000l;
//
//    public static void main(String[] args) {
//        Integer[] a = new Integer[]{1,2,3,4,5,6};
//        int[] b = new int[4];
////        ArrayList<Integer> list = new ArrayList<>();
////        list.add(0,3);
////        list.add(0,5);
////        list.add(0,9);
////        System.out.println(list.toString());
//    }

    public static void main(String[] args) {
        String s = new String();
        try {
            synchronized (s){
                System.out.println("sss");
                s.wait();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


