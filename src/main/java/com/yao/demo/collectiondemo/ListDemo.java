package com.yao.demo.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		System.out.println("========== 1 ========== list addAll");
		List<String> lists = new ArrayList<>();
		
		lists.add("Jack");
		lists.add("Jack1");
		lists.add("Jack2");
		
		List<String> lists1 = new ArrayList<>();
		lists1.add("Jack3");
		lists1.add("Jack4");
		lists1.add("Jack5");
		
		System.out.print("lists : ");
		System.out.println(lists);
		System.out.print("lists1 : ");
		System.out.println(lists1);
		System.out.print("lists addAll lists1 : ");
		lists.addAll(lists1);
		System.out.println(lists);
		

		System.out.println("========== 0 ==========");
	}
}
