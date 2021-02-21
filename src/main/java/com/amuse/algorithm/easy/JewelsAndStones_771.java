package com.amuse.algorithm.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName JewelsAndStones
 * @Description 宝石与石头
 * @Author 刘培振
 * @Date 2021-01-27 16:00
 * @Version 1.0
 */
public class JewelsAndStones_771 {

    public int numJewelsInStones(String jewels, String stones) {
        int num = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(String.valueOf(jewels.charAt(i)));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(String.valueOf(stones.charAt(i)))) {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        JewelsAndStones_771 jewelsAndStones771 = new JewelsAndStones_771();
        int num = jewelsAndStones771.numJewelsInStones("aA", "aAAbbbb");
//        int num = jewelsAndStones.numJewelsInStones("z", "ZZ");
        System.out.println(num);

    }

}
