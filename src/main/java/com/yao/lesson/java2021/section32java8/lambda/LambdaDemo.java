package com.yao.lesson.java2021.section32java8.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LambdaDemo {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap();
		
		map.put("1", "111");
		map.put("2", "222");
		map.put("3", "333");
		map.put("4", "444");
		
		map.forEach((k, v) -> System.out.println("Map key : " + k + ", Value :" + v));
		
		List<String> list = new ArrayList<>();
		list.add("cat1");
		list.add("cat2");
		list.add("cat3");
		list.forEach(x -> System.out.println("list  Value :" + x)) ;
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello world!");
				
			}
		});
		
	}

}
