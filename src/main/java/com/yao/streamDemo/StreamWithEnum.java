package com.yao.streamDemo;

import com.yao.enumdemo.VentilationFactorEnum;

import java.util.stream.Stream;

/**
 * Created by Jack Yao on 2022/4/7 11:19 AM
 */
public class StreamWithEnum {
    public static void main(String[] args) {
        System.out.println(VentilationFactorEnum.values());
        String s1 = "通風不良";
        for (VentilationFactorEnum a : VentilationFactorEnum.values()) {
            System.out.println("=================foreach============");
            System.out.println("a.getCode() : " + a.getCode() + " a.getDescTr() : " + a.getDescTr());
        }
        System.out.println("=============Stream0==============================================");
        Stream.of(VentilationFactorEnum.values()).filter(e -> e.getDescTr().equals(s1)).forEach(e -> System.out.println(e.getDescTr()));
        Stream.of(VentilationFactorEnum.values()).filter(e -> e.getDescTr().equals(s1)).forEach(e -> System.out.println(e.getPredictor()));
        System.out.println("=============Stream1==============================================");
        System.out.println(Stream.of(VentilationFactorEnum.values()).filter(e -> e.getDescTr().equals(s1)).findAny().map(VentilationFactorEnum::getPredictor));
        System.out.println(Stream.of(VentilationFactorEnum.values()).filter(e -> e.getDescTr().equals(s1)).findAny().map(VentilationFactorEnum::getPredictor).orElse(0.0));
        System.out.println("=============Stream2==============================================");
        System.out.println(Stream.of(VentilationFactorEnum.values()).filter(e -> e.getPredictor() < 0.2).findAny());
        System.out.println(Stream.of(VentilationFactorEnum.values()).filter(e -> e.getPredictor() < 0.1).findAny());
        System.out.println(Stream.of(VentilationFactorEnum.values()).filter(e -> e.getPredictor() < 0.02).findAny());

        System.out.println(Stream.of(VentilationFactorEnum.values()).filter(e -> e.getPredictor() < 0.002).map(e -> e.getPredictor()));
        System.out.println(Stream.of(VentilationFactorEnum.values()).filter(e -> e.getPredictor() < 0.002).findAny());
        System.out.println(Stream.of(VentilationFactorEnum.values()).filter(e -> e.getPredictor() < 0.002).findAny().map(e -> e.getPredictor()));

        System.out.println("=============Stream3==============================================");

        System.out.println(Stream.of(VentilationFactorEnum.values()).findAny());

//        Stream.of(VentilationFactorEnum.values()).filter(e -> e.getDescTr().equals(s1)).findAny().map(e -> System.out.println(e.getDescTr()));

    }
}
