package com.yao.demo.filedemo;
/*
 * @author Jack
 * @date 2022/12/21
 * */

import javax.swing.text.StyledEditorKit;
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class ReadFileNameDemo {
    public static void main(String[] args) {
        File files = new File("/Users/yaochinho/Desktop/照片整理一百張");
        File[] f1 = files.listFiles();
        List<String> list = new ArrayList<>();
        for (File file: f1) {
            list.add(file.getName());
        }
        Collections.sort(list);
        Map<Integer,String> map = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(i,list.get(i));
        }
        System.out.println("=======================0");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("=======================1");
        System.out.println(map);
//        list.stream().map(e)

    }
}
