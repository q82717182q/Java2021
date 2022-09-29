package com.yao.demo.optionaldemo;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * Created by Jack Yao on 2022/2/27 3:04 PM
 */
public class ParseDemo {
    public static void main(String[] args) {
        String s1 = "Jack";
        String s2 = null;
//        System.out.println(Integer.parseInt(s1));
        System.out.println(StringToInt(s1));
        System.out.println(Optional.ofNullable(s2));
        System.out.println(Optional.ofNullable(s2).orElse("") + "I'm empty.");
    }

    public static Optional<Integer> StringToInt(String s){
        try {
            return Optional.of(Integer.parseInt(s));
        }catch (Exception e){
            return Optional.empty();
        }
    }
}
