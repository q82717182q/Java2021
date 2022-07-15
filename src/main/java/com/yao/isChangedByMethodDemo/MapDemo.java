package com.yao.isChangedByMethodDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jack Yao on 2022/3/18 9:22 AM
 */
public class MapDemo {
    public static void main(String[] args) {
        String s1 = "jack";
        String s2 = "jacky";
        int i1 = 123;
        int i2 = 456;

        Map<String,Object> map1 = new HashMap<>();
        map1.put("s1",s1);
        map1.put("s2",s2);
        map1.put("i1",i1);
        map1.put("i2",i2);
        System.out.println("map1 before adjust : " + map1);


        adjustMap(map1);

        //有不同參數需要修改的時候可以用map來裝，不要一個一個直接傳，因為像String這種東西傳到方法裡面修改，本身還是不會改變的
        System.out.println("map1 after adjust : " + map1);
    }

    private static void adjustMap(Map<String, Object> map1) {
        map1.put("s1",map1.get("s1")+"123");
        map1.put("s2",map1.get("s2")+"456");
        map1.put("i1",(int)map1.get("i1")+777);
        map1.put("i2",(int)map1.get("i2")+888);
    }
}
