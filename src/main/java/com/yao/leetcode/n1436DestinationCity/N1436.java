package com.yao.leetcode.n1436DestinationCity;
import java.util.*;
//不懂直接看解答吧～
//直覺地去設計map別想太多
//共用時20分
public class N1436 {
    public String destCity(List<List<String>> paths) {
    	String destination = "";
    	Map<String, String> map = new HashMap<String, String>();
    	
    	for (List<String> element : paths) {
    		map.put(element.get(0), element.get(1));
		}
    	String start = paths.get(0).get(0);
    	while (start!=null) {
			String end = map.get(start);
			if (end == null) {
				return start;
			}
			start = end;
		}
    	
    	return null;
    }
}

//如果左邊沒有任何等於就是起點
//一的右邊等於二的左邊就是放一放在二的左邊
//右邊沒有任何等於就是終點