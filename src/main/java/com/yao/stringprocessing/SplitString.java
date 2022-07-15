package com.yao.stringprocessing;

/**
 * Created by Jack Yao on 2022/3/29 10:51 AM
 */
public class SplitString {
    public static void main(String[] args) {
        String s1 = "[Q2021-11-11-0039] QA_Facility";

        String s2 = "TWA: 100 ppm";

        for (String element : s2.split(" ")) {
            System.out.println(element);

            if (isNumeric(element))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
