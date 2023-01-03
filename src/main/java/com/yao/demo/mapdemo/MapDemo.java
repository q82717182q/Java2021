package com.yao.demo.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		
		
		
		System.out.println("==========0 do something in map");
		Map<String, Student> map = new HashMap<>();
		map.put("Jack", new Student());
		map.get("Jack").setId(123);
		map.get("Jack").setName("Jack25");
		System.out.println(map);
	}
}


class Student{
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}