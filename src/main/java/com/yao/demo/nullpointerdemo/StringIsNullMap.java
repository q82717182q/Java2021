package com.yao.demo.nullpointerdemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jack Yao on 2022/3/18 10:45 AM
 */
public class StringIsNullMap {
    public static void main(String[] args) {
        String s1 = null;
        System.out.println("----------------------------------------------1");
        if (s1 == null)
            System.out.println("s1 is null! : " + s1);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("s1",s1);
        if (map1.get("s1") == null) {
        	System.out.println("----------------------------------------------2");
        	System.out.println("map1.get(\"s1\") is null : " + map1.get("s1"));
        	
        }
        if ((String)map1.get("s1") == null) {
        	System.out.println("----------------------------------------------3");
        	System.out.println("(String)map1.get(\"s1\") is null : " + (String)map1.get("s1"));
        
        }
        if ((String)map1.get("s1") == "null") {
        	System.out.println("----------------------------------------------4");
        	System.out.println("(String)map1.get(\"s1\") is in String null : " + (String)map1.get("s1"));
        	map1.put("s2",null);
        	
        }
        if (map1.get("s2") == null) {
        	
        	System.out.println("----------------------------------------------5");
        	System.out.println("(String)map1.get(\"s2\") is null : " + (String)map1.get("s2"));
        	if (map1.get("s2") == "null") {
        		
        		System.out.println("----------------------------------------------6");
        		System.out.println("(String)map1.get(\"s2\") is null : " + (String)map1.get("s2"));
        	}
        }
        System.out.println("----------------------------------------------7");
        Map<String, String> map2 = null;
        System.out.println(null == map2);
        
        System.out.println("----------------------------------------------8");
        Map<String, String> map3 = new HashMap<>();
        System.out.println(map3 == null);
        
        System.out.println("----------------------------------------------9");
        Map<String, String> map4 = new HashMap<>();
        map4.put("org_code", null);
        System.out.println(map4.containsKey("org_co"));
        System.out.println(map4.containsKey("org_code"));
        System.out.println(map4.get("org_code"));
        
        if (map4 != null && map4.containsKey("org_code") ) {
			
		}
        

        
//        System.out.println(map2.isEmpty());
        
    }
}
