package com.amuse.algorithm.jz;

/**
 * @ClassName Other
 * @Description TODO
 * @Author 刘培振
 * @Date 2021-06-30 21:32
 * @Version 1.0
 */
public class LiKou17 {

    //打印从1到最大的n位数
    public void printToMaxOfNDigits(int n) {
        int number = 1;
        for(int i = 0;i<n;i++){
            number = number * 10;
        }
        for (int i = 1; i < number; i++) {
            System.out.println(i);
        }
    }


//    public void printToMaxOfNDigits2(int n) {
//        String[] s = new String[n];
//        for(int i = 0; i< n; i++){
//            s[i] =  "0";
//        }
//        String[] max = new String[n];
//        for(int i = 0; i< n; i++){
//            max[i] = "9";
//        }
//        while (!s.equals(max)){
//            char a = s.charAt(n-1);
//            if(a != '9'){
//
//            }
//            for (int i = 0; i < n; i++){
//
//            }
//        }
//    }





    public static void main(String[] args) {
//        Other other = new Other();
//        other.printToMaxOfNDigits(3);
        char b = '3';
        System.out.println(b);
        System.out.println(b +1);
    }

}
