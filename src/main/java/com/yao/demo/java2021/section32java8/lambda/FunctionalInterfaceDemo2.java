package com.yao.demo.java2021.section32java8.lambda;

public class FunctionalInterfaceDemo2 implements sayableDemo2{

	public static void main(String[] args) {
		new FunctionalInterfaceDemo2().say("Jack say HI!!!!!!!!!!!");
	}

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

}

interface talk{
	
}

@FunctionalInterface
interface sayableDemo2 extends talk{
	void say(String msg);
	int hashCode();
	String toString();
	boolean equals(Object obj);
	static void sayHi() {
		System.out.println("Hi");
	}
}