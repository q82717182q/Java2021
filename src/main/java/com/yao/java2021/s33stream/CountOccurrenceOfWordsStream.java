package com.yao.java2021.s33stream;

import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jack Yao on 2022/2/12 4:11 PM
 */
//統計單字出現次數
//分隔規則是用符號或空格，這邊用split 正則表達式
    //s+表示一個多個
    //無狀態的操作可以用並行提高效率 parallel()
    //文字長度要大於零
    //collect()給規則方法
public class CountOccurrenceOfWordsStream {
    public static void main(String[] args) {
        String text = "Good morning. Have a good class. "
                + "Have a good visit. Have fun!";
        Stream.of(text.split("[\\s+\\p{Punct}]")).parallel()
                .filter(e -> e.length() >0 ).collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()))
                .forEach((k, v) -> System.out.printf("\n%10s : %10s",k,v));
//        System.out.println(k + " : " + v)
    }
}
