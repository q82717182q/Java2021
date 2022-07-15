package com.yao.java2021.s20.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jack Yao on 2022/2/13 3:19 PM
 */
public class HomeWork3 {
    public static void main(String[] args) {
        //匹配一个给定字符串中的电话号码
        //
        String phone = "186378669645";
        Pattern pattern = Pattern.compile("^\\d{11}$");
        Matcher matcher = pattern.matcher(phone);
        System.out.println("--------------1---------------");
        if (matcher.find()) {
            System.out.println(true);
        }
        else System.out.println(false);

        System.out.println("--------------2---------------");

        //老師版
        String phoneT = "18637866964";
        String reg = "^1[3,5,7,8,9]\\d{9}$";
        System.out.println(phone.matches(reg));
    }
}
