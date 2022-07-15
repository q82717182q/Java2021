package com.yao.stringprocessing;

/**
 * Created by Jack Yao on 2022/4/21 4:15 PM
 */
public class StringAddStringDemo {
    public static void main(String[] args) {
        String s1 = "Jack";
        String s2 = addString(s1);
        System.out.println("===============================0");
        System.out.println("s1 : " + s1);
        s1 = addString(s1);
        System.out.println("===============================1");
        System.out.println("s1 : " + s1);
        System.out.println("===============================2");
        System.out.println("s2 : " + s2);
    }

    private static String addString(String s1){
        s1 = s1 + "add";
        return s1;
    }
}
