package com.yao.demo.collectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {
	public static void main(String[] args) {
		System.out.println("===========0=========== ");
		Map<String, String> map = new ConcurrentHashMap<>();
		map.putIfAbsent(null, null);
		Map<String, String> map1 = new HashMap<>();
		map1.putIfAbsent(null, null);
		map1.getOrDefault("JAck", "");
	}

}
