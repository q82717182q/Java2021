package com.yao.reflection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Objects.hash;

/**
 * Created by Jack Yao on 2021/11/30 10:37 下午
 */
public class Test07 {
    public static void main(String[] args) {
        System.out.println("1" + //tests
                "2");
        Map<String,String> map = new ConcurrentHashMap<>();
        String name = "Jack";
        System.out.println(hash(name));
    }
}
