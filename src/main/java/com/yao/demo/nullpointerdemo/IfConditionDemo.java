package com.yao.demo.nullpointerdemo;

public class IfConditionDemo {
	public static void main(String[] args) {
		
		StringBuilder speak = new StringBuilder();
		int num = 2;
		speak.append("I ")
		     .append("eat ");
		if (num == 1) {
			speak.append("an apple.");
		}else {
			speak.append("a banana.");
		}
		String a = speak.toString();
		System.out.println("a : " + a);

	}
}
