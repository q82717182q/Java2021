package com.yao.demo.java2021.S23generics;

/**
 * Created by Jack Yao on 2022/3/14 8:57 AM
 */
public class GenericStaticMethodDemo2 {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "Tokyo", "New York"};

        GenericStaticMethodDemo2.<Integer>print(integers);
        GenericStaticMethodDemo2.<String>print(strings);
        System.out.println("---------0----------");
    }

    //透過extend指定泛型範圍，像這邊如果指定<E extends String>，那12行<Integer>print(integers)就會報錯
    //所以其實什麼都不加<E>效果就跟<E extends Object>是一樣的
    //
    public static <E extends Object> void print(E[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

}
