package com.yao.demo.stringprocessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jack Yao on 2022/3/30 10:08 AM
 */
public class StringParserWithRegular {
    public static void main(String[] args) {
        final String regex = " [0-9]*.[0-9]* ";
        final String string = "TWA: 100 ppm; 303 mg/m3  ;STEL: 125 ppm; 378.75 mg/m3";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }


        //TWA: 100 ppm; 303 mg/m3  ;STEL: 125 ppm; 378.75 mg/m3
        //TWA-ppm = 100, TWA-mg/m3 = 303, STEL-ppm = 125, STEL-mg/m3 = 378.75
    }
}
