package com.yao.demo.collectiondemo.listdemo;
/*
 * @author Jack
 * @date 2022/12/21
 * */

import java.util.ArrayList;
import java.util.List;

public class ListToStringDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Jacky");
        list.add("JackYao");
        list.add("JackYaoChinHo");
        System.out.println("list : ");
        System.out.println("list : " + list.toString());
    }
}
