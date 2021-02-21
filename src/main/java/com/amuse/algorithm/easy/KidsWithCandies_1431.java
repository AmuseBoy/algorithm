package com.amuse.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName KidsWithCandies
 * @Description 拥有最多糖果的孩子
 * @Author 刘培振
 * @Date 2021-01-27 16:29
 * @Version 1.0
 */
public class KidsWithCandies_1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleans = new ArrayList<>();
        int max = 0;
        for(int i = 0; i <candies.length; i++){
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max){
                booleans.add(true);
            }else {
                booleans.add(false);
            }
        }
        return booleans;
    }

    public static void main(String[] args) {
        KidsWithCandies_1431 kidsWithCandies1431 = new KidsWithCandies_1431();
        List<Boolean> booleans = kidsWithCandies1431.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        System.out.println(booleans.toString());

    }
}
