package com.yao.java2021.S23generics;

import java.sql.SQLOutput;

/**
 * Created by Jack Yao on 2022/3/14 8:57 AM
 */
public class GenericStaticMethodDemo {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "Tokyo", "New York"};

        //泛型方法呼叫需要用尖括號，然後裡面要寫上具體型別是什麼
        GenericStaticMethodDemo.<Integer>print(integers);
        GenericStaticMethodDemo.<String>print(strings);
        System.out.println("---------0----------");
        //不用泛型效果方法一樣啊，那泛型有什麼優點呢？
        GenericStaticMethodDemo.print2(integers);
        GenericStaticMethodDemo.print2(strings);
    }

    //定義靜態方法打印這些元素
    public static <E> void print(E[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void print2(Object[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
