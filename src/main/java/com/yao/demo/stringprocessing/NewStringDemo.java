package com.yao.demo.stringprocessing;

/**
 * Created by Jack Yao on 2022/3/30 9:26 AM
 */
public class NewStringDemo {
    public static void main(String[] args) {
        String s1;
        String s2 = "";
        String s3 = null;
        String result = "apple";
//        String result = "bicycle";
        Boolean isApple = "apple".equals(result);
        if (isApple){
//            System.out.println("s1 : " + s1); //Variable 's1' might not have been initialized
            System.out.println("s2 : " + s2);
            System.out.println("s3 : " + s3);
        }else {
//                        System.out.println("s1 : " + s1); //Variable 's1' might not have been initialized
            System.out.println("s2 : " + s2);
            System.out.println("s3 : " + s3);
        }
    }
}
