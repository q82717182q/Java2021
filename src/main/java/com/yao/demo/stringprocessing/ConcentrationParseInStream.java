package com.yao.demo.stringprocessing;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jack Yao on 2022/4/7 11:32 AM
 */
public class ConcentrationParseInStream {
    public static void main(String[] args) {
        final String s1 = "TWA: 100 ppm; 434 mg/m3  ;STEL: 125 ppm; 542.5 mg/m3";
        System.out.println("==================================================================0");
        Stream.of(s1.split(" ")).forEach(System.out::println);
        System.out.println("==================================================================1");
        Stream.of(s1.split(" ")).collect(Collectors.toList());
//        Stream.of(s1.split(" ")).collect(Collectors.toMap());
        System.out.println("==================================================================2");
//        System.out.println(Stream.of(s1.split(" ")).filter(e -> "TWA:".equals(e)));//印出hashcode
        System.out.println(Stream.of(s1.split(" ")).filter(e -> "TWA:".equals(e)).findAny().orElse(""));

    }
}
