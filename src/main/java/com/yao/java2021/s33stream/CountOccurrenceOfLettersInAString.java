package com.yao.java2021.s33stream;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jack Yao on 2022/2/12 1:42 PM
 */
//統計字符串中每個字母出現字數

public class CountOccurrenceOfLettersInAString {

    //控制來輸入字符串，可輸入數字與字符
    //程序會過濾無效的字符，
    //map轉換成大寫
    //最終統計每一個字母出現次數
    private static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = scanner.nextLine();
        System.out.println("Your input is : " + s);
        //toCharArray()返回的是數組，(但是Stream.of吃的是物件，所以要自定義
        //filter是中間方法，會返回一個新的流，符合filter就加到此新流中
        Stream.of(toCharacterArray(s.toCharArray())).filter(e -> Character.isLetter(e))
                .map(e -> Character.toUpperCase(e))
                .collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " occurs " + v + (v > 1 ? " times " : " time ")));
    }

    private static Character[] toCharacterArray(char[] list) {
        Character[] result = new Character[list.length];
        for (int i = 0; i < list.length; i++) {
            result[i] = list[i];
        }
        return result;
    }

}
