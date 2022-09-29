package com.yao.demo.java2021.s33stream;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Jack Yao on 2022/2/10 9:51 PM
 */
public class CollectGroupingByDemo {
    public static void main(String[] args) {
        System.out.println("\n----------------------0-----------------");

        String[] names = {"John","Peter","Susan","Kim","Jen","George","Alan","Stacy","Michelle","john"};
        //使用groupingBy 進行分組;
        Map<String, Long> map1 = Stream.of(names).map(e -> e.toUpperCase())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));//第一個參數是分類器，用來指定分組標準;第二個參數是處理器，決定處理方式，這邊是統計出現次數
        System.out.println("groupingBy map1 : " + map1);
//        System.out.println("map map1 : " + Stream.of(names).collect(Collectors.toMap(e ->e, e -> e.length())));

        /*practice*/
        System.out.println("\n----------------------0-practice----------------");
//        Stream.of(names).forEach(System.out::println);
//        Map<String, Long> map2 = Stream.of(names).map(e -> e.toUpperCase());

        System.out.println("\n----------------------1-----------------");
        //上面是用map，這邊用重載處理
        Map<Character, Long> map2 = Stream.of(names).collect(Collectors.groupingBy(
                e -> e.charAt(0), TreeMap::new, Collectors.counting()));//第一個參數這邊統計規則為首個字母，第二個參數是把結果放到TreeMap裡面；第三個參數計算次數
        System.out.println(map2);

        System.out.println("\n----------------------2-----------------");
        int[] values = {2, 3, 4, 1, 2, 3, 2, 3, 4, 5, 1, 421};
        IntStream.of(values).mapToObj(e ->e)    //把數組轉換成對象
                        .collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting()))//第一個參數指定排序規則；第二個參數把統計結果丟到TreeMap；第三個參數按照出現字數進行分組
                                .forEach((k, v) -> System.out.println(k + " occurs " + v + (v > 1 ? " times " : " time ")));//調用forEach來遍歷TreeMap元素

        System.out.println("\n12345678901234567890-------------3");

        MyStudent[] students = {new MyStudent("John", "Lu", "CS" , 32, 78),
						        new MyStudent("Susan", "Yao", "Math" , 31, 85.4),
						        new MyStudent("Kim", "Johnson", "CS" , 30, 78.1)};
        System.out.printf("%10s%10s\n", "Department", "Average");
        Stream.of(students).collect(Collectors.groupingBy(
                MyStudent::getMajor, TreeMap::new, Collectors.averagingDouble(MyStudent::getScore)))//分類指定為專業；丟到TreeMap；規則取分數平均值
                        .forEach((k, v) -> System.out.printf("%10s%10.3f\n", k, v));//遍歷TreeMap
        System.out.println("\n----------------------3-practice----------------");
//        //把getFirstName當Ｋ，students當成V
//        Map<String, List<MyStudent>> myStudentMap = Arrays.stream(students).collect(Collectors.groupingBy(MyStudent::getFirstName));
//        System.out.println("myStudentMap : " + myStudentMap);

//        Map<String, MyStudent> myStudentMap2 = Arrays.stream(students).collect(Collectors.groupingBy(MyStudent::getFirstName));
//        Map<String, MyStudent> myStudentMap3 = Stream.of(students).collect(Collectors.groupingBy(MyStudent::getFirstName));
//        System.out.println("myStudentMap : " + myStudentMap2);




    }
}
