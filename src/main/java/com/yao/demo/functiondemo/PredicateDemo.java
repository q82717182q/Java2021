package com.yao.demo.functiondemo;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		
		
		
		System.out.println("===========0===========");
		Predicate<Integer> isBetween10and100 = u -> u != null && (10 <= u && u <= 100);
		System.out.println(isBetween10and100.test(90));
	}
}
