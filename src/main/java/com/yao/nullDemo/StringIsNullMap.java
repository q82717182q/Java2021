package com.yao.nullDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jack Yao on 2022/3/18 10:45 AM
 */
public class StringIsNullMap {
    public static void main(String[] args) {
        String s1 = null;
        if (s1 == null)
            System.out.println("s1 is null! : " + s1);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("s1",s1);
        if (map1.get("s1") == null)
            System.out.println("map1.get(\"s1\") is null : " + map1.get("s1"));
        if ((String)map1.get("s1") == null)
            System.out.println("(String)map1.get(\"s1\") is null : " + (String)map1.get("s1"));
        if ((String)map1.get("s1") == "null")
            System.out.println("(String)map1.get(\"s1\") is in String null : " + (String)map1.get("s1"));
        map1.put("s2",null);
        if (map1.get("s2") == null)
            System.out.println("(String)map1.get(\"s2\") is null : " + (String)map1.get("s2"));
        if (map1.get("s2") == "null")
            System.out.println("(String)map1.get(\"s2\") is null : " + (String)map1.get("s2"));
    }
}
