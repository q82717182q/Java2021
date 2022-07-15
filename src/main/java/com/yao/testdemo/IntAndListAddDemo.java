package com.yao.testdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack Yao on 2022/3/2 10:37 AM
 */
public class IntAndListAddDemo {
    public static void main(String[] args) {
        int a = 100;
        int b = 123;
        addOne(a);
        int c = addOneAndReturn(b);
        System.out.println("a : " + a);
        a = a+1;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        b = b + 1;
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        List<Object> aList = new ArrayList<>();
        aList.add(123);
        aList.add(456);
        System.out.println("-----------------");
        System.out.println(aList);

        System.out.println("----------0-------");
        addList(aList);


        System.out.println(aList);
    }

    private static void addList(List<Object> aList) {
        aList.add("test for add method");
    }

    private static int addOneAndReturn(int b) {
        return b+1;
    }

    private static void addOne(int a) {
        a = a+1;
        System.out.println("a in method addOne() : " + a);
    }
}
