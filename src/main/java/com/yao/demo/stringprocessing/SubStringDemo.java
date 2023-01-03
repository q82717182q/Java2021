package com.yao.demo.stringprocessing;

public class SubStringDemo {
	public static void main(String[] args) {
		
		System.out.println("------------------------------999");
		
		String n1 = "中高齡者退休後再就業準備訓練補助實施計畫";
		String n2 = "中高齡者退";
		
		System.out.println("s1 : " + n1.substring(0, 4) + "...");
		
		if (n2.length() > 4) {
			System.out.println("s2 : " + n2.substring(0, 4) + "...");
		}else {
			
			System.out.println("s2 : " + n2 );
		}
		
		System.out.println("------------------------------2");
		
		String speak = "Jack likes to play tennis. ";
		speak.substring(8);
		System.out.println("------------------------------0");
		System.out.println(speak );
		System.out.println("------------------------------1");
		
		speak = speak.substring(8);
		System.out.println(speak );
	}
}
