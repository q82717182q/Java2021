package com.yao.demo.java2021.s33stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jack Yao on 2022/2/8 10:47 PM
 */
public class CollectDemo {
    public static void main(String[] args) {
        //Lesson 375
        String[] names = {"John","Peter","Susan","Kim","Jen","George","Alan","Stacy","Michelle","john"};

        System.out.println("The number of characters for all names: " +
                //利用StringBuilder::new創建SB容器
                Stream.of(names).collect(StringBuilder::new,    //第一個參數為供應器，給我們提供容器來存放元素
                        StringBuilder::append,      //第二個參數，稱為累加器，把這參數添加到第一個參數提供的容器中
                        StringBuilder::append).length());   //第三個參數稱為合併器，把並行運算結果結果合併起來，就是collect是並行運算的
        //如此拼接的過程是在StringBuilder中進行所以比String拼接還有效
        //因為collect方法是並行運算的
        System.out.println("\n----------------------0-----------------");

        List<String> list = Stream.of(names).collect(ArrayList::new,
                ArrayList::add,
                ArrayList::addAll);
        System.out.println(list);

        System.out.println("\n----------------------1-----------------");

        list = Stream.of(names).collect(Collectors.toList());//跟剛剛上面一大串代碼是等價的
        System.out.println(list);

        System.out.println("\n----------------------2-----------------");

        Set<String> set = Stream.of(names).map(e -> e.toUpperCase()).collect(Collectors.toSet());
        System.out.println(set);

        System.out.println("\n----------------------3-----------------");
        Map<String,Integer> map = Stream.of(names).collect(Collectors.toMap(e -> e, e -> e.length()));
        System.out.println(map);

        System.out.println("\n----------------------4-----------------");
        //collect更多用法
        System.out.println("The total number of characters is " +
                Stream.of(names).collect(Collectors.summingInt(e -> e.length())));//summingInt統計當前流裡面數字的總和


        System.out.println("\n----------------------5-----------------");
        //summarizingInt是統計數據
        IntSummaryStatistics stats = Stream.of(names).collect(Collectors.summarizingInt(e -> e.length()));
        System.out.println("Max is " + stats.getMax());
        System.out.println("Min is " + stats.getMin());
        System.out.println("Average is " + stats.getAverage());

        //能使用Collectors就盡量使用這個
    }
}
