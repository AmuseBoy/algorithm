package com.amuse.algorithm.jz;

/**
 * @description: 数值的整数次方
 * @projectName: algorithm
 * @see: com.amuse.algorithm.jz
 * @author: 刘培振
 * @createTime: 2021/3/6 21:15
 * @version:1.0
 */
public class JZ12 {

    public double Power(double base, int exponent) {
        double result = 1d;
        if (exponent < 0) {
            if (base == 0) {
                return 0d;
            }
            for (int i = 0; i > exponent; i--) {
                result = result * base;
            }
            return 1 / result;
        } else if (exponent == 0) {
            return result;
        } else {
            for (int i = 0; i < exponent; i++) {
                result = result * base;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        JZ12 jz12 = new JZ12();
        double sum = jz12.Power(0.0, -3);
        System.out.println(sum);
    }
}
