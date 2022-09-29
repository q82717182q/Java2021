package com.yao.demo.nullpointerdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		System.out.println(new HashMap<String, Object>() {
			/**
			 * 
			 */
//			private static final long serialVersionUID = 1L;

			{ put("org_code", "HRD");}
		});
		System.out.println("----------------------------1");
		System.out.println("----------------------------1");
		Map<String, Object> map = new HashMap<>();
		map.put("org_Code", "HRD");
		System.out.println(map.entrySet().stream().anyMatch(e -> e.getKey().equalsIgnoreCase("org_code")));
		
		Map<String, Object> map2 = new HashMap<String, Object>() { /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{ put ("key", "value"); } };
		
	}
}
