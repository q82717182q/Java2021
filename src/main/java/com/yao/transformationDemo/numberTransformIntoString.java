package com.yao.transformationDemo;

/**
 * Created by Jack Yao on 2022/3/29 9:06 AM
 */
public class numberTransformIntoString {
    public static void main(String[] args) {
        Double d1 = 12345.67;
        String s1 = "12345.67";
        Boolean b1 = true;
        Boolean b2 = false;
        System.out.println(String.valueOf(d1));
        System.out.println(s1);
        System.out.println(s1.equals(String.valueOf(d1)));
        System.out.println(s1.equals(d1.toString()));
//        System.out.println(s1.equals((String)d1);//Inconvertible types; cannot cast 'java.lang.Double' to 'java.lang.String'
        System.out.println(s1.equals(b1 == true ? d1 : s1));

//        System.out.println(s1.equals((String)(b1 == true ? d1 : s1)));//ClassCastException: java.lang.Double cannot be cast to java.lang.String
        System.out.println(s1.equals(String.valueOf(b1 == true ? d1 : s1)));//有Double別直接用(String)轉型，要用String.valueOf()
    }

}
