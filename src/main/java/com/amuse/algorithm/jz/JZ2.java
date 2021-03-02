package com.amuse.algorithm.jz;

/**
 * @ClassName JZ2
 * @Description 替换空格
 * @Author 刘培振
 * @Date 2021-03-02 16:40
 * @Version 1.0
 */
public class JZ2 {

    public String replaceSpace (String s) {
        return s.replace(" ", "%20");
    }


    public static void main(String[] args) {
        JZ2 jz2 = new JZ2();
        System.out.println(jz2.replaceSpace("We Are Happy"));
    }
}
