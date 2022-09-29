package com.yao.lesson.java2021.section32java8.lambda;

public class MultipleParameters {
	
	public static void main(String[] args) {
		Add demo1 = (a,b) ->{
			return a+b;
		};
		
		System.out.println(demo1.sum(123, 456));
		
		Add demo2 = (int a,int b) -> (a+b);             //要直接一行解決就不能有return，有沒有宣告型態都可以
		
		System.out.println(demo1.sum(333, 444));
		
		System.out.println("-----------------sayable----------------");
		SayableMultiple sayable = (a,b) ->{
			String s1 = "I am saying";
			return s1+a+b ;
		};
		System.out.println(sayable.say(" Jack", " Love Play vedio games."));
	}

}
@FunctionalInterface
interface SayableMultiple{
	String say(String a,String b);
}

@FunctionalInterface
interface Add{
	public Integer sum(int a, int b);
}
