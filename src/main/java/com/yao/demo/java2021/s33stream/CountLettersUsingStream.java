package com.yao.demo.java2021.s33stream;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jack Yao on 2022/2/11 11:37 AM
 */
public class CountLettersUsingStream {
    private static int count = 0;
    public static void main(String[] args) {
        Random random = new Random();
//        System.out.println((int)'a');

        //隨機生成一百個小寫字母，進行輸出
        //使用random.ints隨機生成
        Object[] chars = random.ints(100,(int)'a',(int)'z'+1)
                .mapToObj(e -> (char) e).toArray();
        //每二十個換行
        System.out.println("The Lowercase letters are : ");
//        Stream.of(chars).forEach(System.out::println);
        Stream.of(chars).forEach(e -> {
            System.out.print(e + (++count % 20 == 0 ? "\n" : " "));
        });

        //接下來統計每個小寫字母出現的次數
        System.out.println("\nThe occurrences of each letter are : ");
        //groupingBy接受三個參數，第一個是分類器，這邊標準就是每個字符本身，第二個是容器，裝返回結果；第三個參數是處理器，定義處理規則
        Stream.of(chars).collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " occurs " + v + ( v > 1 ? " times " : " time ")));
        System.out.println();
    }
}
