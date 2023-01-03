package com.yao.demo.stringprocessing;

public class EmptyDemo {
	public static void main(String[] args) {
		String a = "";
		String b = " ";
		String c = "  ";
		
		
		
		if (a.isEmpty()) {
			System.out.println("a is empty.");
		}
		if (b.isEmpty()) {
			System.out.println("b is empty.");
		}
		if (c.isEmpty()) {
			System.out.println("c is empty.");
		}
		if (c.trim().isEmpty() ) {
			System.out.println("c.trim is empty.");
		}
		
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(c.length());
	}
}
