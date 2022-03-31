package com.amuse.algorithm.jz;

/**
 * @ClassName JZ12
 * @Description 数值的整数次方
 * @Author 刘培振
 * @Date 2021-06-29 20:11
 * @Version 1.0
 */
public class JZ12 {

/*    public double Power(double base, int exponent) {
        if (base == 0) {
            throw new ArithmeticException();
        }
        if (exponent == 0) {
            return 1;
        }
        double result = 1.0;
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result = result * base;
            }
        } else {
            for (int i = 0; i < Math.abs(exponent); i++) {
                result = result * base;
            }
            result = 1 / result;
        }
        return result;
    }*/

    //假设求8次方，只需要求4次方，然后再求2次方，再求1次方，每次除/2
    public double Power(double base, int exponent) {
        if (base == 0) {
            throw new ArithmeticException();
        }
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        if (exponent > 0) {
            if( (exponent & 1) == 1){
                double result =  Power(base, exponent>>1);
                return result*result*base;
            }else {
                double result =  Power(base, exponent>>1);
                return result*result;
            }
        }else {
            exponent = Math.abs(exponent);
            if( (exponent & 1) == 1){
                double result =  Power(base, exponent>>1);
                return 1/(result*result*base);
            }else {
                double result =  Power(base, exponent>>1);
                return 1/(result*result);
            }
        }

    }

    public static void main(String[] args) {
        //System.out.println(new JZ12().Power(2.10000, 3));
        System.out.println(new JZ12().Power(2.0000, 3));
    }
}
