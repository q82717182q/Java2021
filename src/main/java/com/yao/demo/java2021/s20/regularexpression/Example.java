package com.yao.demo.java2021.s20.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jack Yao on 2022/2/13 8:45 AM
 */
public class Example {
    public static void main(String[] args) {
        final String regex = "(\\d{3})-(\\d{8})";
        final String string = "010-12345678";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        //這邊會被調用三次，因為匹配到三個結果
        //group0是全匹配結果
        //for迴圈從1開始
        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
