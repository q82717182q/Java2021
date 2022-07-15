package com.yao.java2021.s20.regularexpression;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Jack Yao on 2022/2/13 3:36 PM
 */
public class HomeWork1 {
    public static void main(String[] args) {
        String s1 = "我我我、、、我我、、我要、我要要、、、要要要、、要要、、学学学、、、、学学编、、、学编编编、、编编编程、、程程";
        String r1 = s1.replaceAll("、+","");
        Set<Character> treeSet = new LinkedHashSet<>();
        for (Character c :  r1.toCharArray()) {
//            System.out.println(c);
            treeSet.add(c);
        }
        System.out.println(r1);
        for (Character c : treeSet) {
            System.out.print(c);
        }
        System.out.println("-----------------------------");
        //老師解法
        String temp = "我我我、、、我我、、我要、要要、、、要要要、、要要、、学学学、、、、学学编、、、编编编、、编编编程、、程程";
        temp=temp.replaceAll("(、+)","");
        temp=temp.replaceAll("(.)\\1+", "$1");
        System.out.print(temp);
    }
}
