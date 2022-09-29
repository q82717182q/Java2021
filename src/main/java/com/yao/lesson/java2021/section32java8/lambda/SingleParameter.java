package com.yao.lesson.java2021.section32java8.lambda;

public class SingleParameter {
	public static void main(String[] args) {
		Sayable s1 = (s111) ->{
			return "s1s1s1" + s111;
		};
		
		Sayable s2 = (s222) ->{
			return "s2s2s2" + s222;
		};
		
		System.out.println(s2.Say("Jack"));
		System.out.println(s1.Say("Funny"));
	}
}

@FunctionalInterface
interface Sayable{
	public String Say(String name);
}
