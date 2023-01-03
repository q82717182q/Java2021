package com.yao.demo.functiondemo;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		
		
		System.out.println("===========0===========");
		Function<String, Integer> countTheStringLength = s -> s.length();
		System.out.println(countTheStringLength.apply("Jack is tall."));
	}
}
