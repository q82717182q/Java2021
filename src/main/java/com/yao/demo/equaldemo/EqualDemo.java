package com.yao.demo.equaldemo;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

import com.yao.demo.listnodedemo.ListNode;

public class EqualDemo {
	public static void main(String[] args) {
		Integer a = 123;
		Integer b = 123;
		Integer c = new Integer(123);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a == c );
		System.out.println(add(a,b));
	}

	private static void concatListNode(ListNode lnA, ListNode lnB) {

	}

	private static Integer add(Integer a, Integer b) {
		Integer aa = a;
		Integer bb = b;
		return aa + bb;
	}
	
	
	
	
}
