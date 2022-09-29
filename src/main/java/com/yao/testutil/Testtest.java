package com.yao.testutil;

import java.util.Scanner;

public class Testtest {

	public static void main(String[] args) {
		
		String aString = new String("Jack");
		String bString = new String("Jack");

		System.out.println(aString == bString);
		System.out.println(aString.equals(bString));
		System.out.println("aString.hashCode()"+aString.hashCode());
		System.out.println("bString.hashCode()"+bString.hashCode());
		
		
		
	}
}
