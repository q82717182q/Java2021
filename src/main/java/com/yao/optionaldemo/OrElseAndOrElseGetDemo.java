package com.yao.optionaldemo;

import java.util.Optional;

/**
 * Created by Jack Yao on 2022/3/2 7:42 AM
 */
public class OrElseAndOrElseGetDemo {
    public static void main(String[] args) {
        String a = "asd";
        String b = null;
        System.out.println("tsest".concat(Optional.ofNullable(a).toString()));
        System.out.println("tsest".concat(Optional.ofNullable(a).orElse("--------").toString()));
        System.out.println("tsest".concat(Optional.ofNullable(a).orElse("--------").toString()));
        System.out.println("tsest".concat(Optional.ofNullable(a).orElse("--------").toString()));
        System.out.println("tsest".concat(Optional.ofNullable(b).orElse("--------").toString()));
        System.out.println("tsest".concat(Optional.ofNullable(b).orElse("").toString()));
        System.out.println("tsest".concat(Optional.ofNullable(b).toString()));


//        System.out.println("test" + Optional.ofNullable(b).orElseGet(getName()); // 無法這樣用
        System.out.println("test" + Optional.ofNullable(b).orElseGet(() -> getName()));
    }
    public static String getName(){
        return "Jack";
    }
}
