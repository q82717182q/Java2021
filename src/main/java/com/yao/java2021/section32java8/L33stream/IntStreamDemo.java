package com.yao.java2021.section32java8.L33stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {
	public static void main(String[] args) {
		int[] values = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};
		//獲取values
		System.out.println("The number of digits in array values is " + Stream.of(values).map(v -> v + "").mapToInt(v -> v.length()).sum());

		
		System.out.println(IntStream.of(values).distinct().filter(v -> v> 3 && v % 2 == 0).average().getAsDouble());
		System.out.println("\n-----------------1-----------------");
		//取前四碼總和
		System.out.println("The sum of the first 4 numbers is " + IntStream.of(values).limit(4).sum());
		System.out.println("\n-----------------2-----------------");

		//獲得統計值，有最大、最小、平均、總和、計次、
		IntSummaryStatistics statictics = IntStream.of(values).summaryStatistics();
		System.out.println("Max is " + statictics.getMax());
		System.out.println("Min is " + statictics.getMin());
		System.out.println("Average is " + statictics.getAverage());
		System.out.println("Count is " + statictics.getCount());
		System.out.println("Sum is " + statictics.getSum());
		System.out.println("Class is " + statictics.getClass());
	
		System.out.println("\n-----------------3-----------------");
		//獲取所有元素字長總和
		String[] names = {"John","Peter","Susan","Kim","Jen","George","Alan","Stacy","Michelle","john"};
		System.out.println(Stream.of(names).mapToInt(n -> n.length()).sum());
		System.out.println("\n-----------------4-----------------");
		//獲取values
		//FIXME 怎麼弄都不是11勒真奇怪
		System.out.println("The number of digits in array values is " + Stream.of(values).map(v -> v + "").mapToInt(v -> v.length()).sum());

		Stream.of(values).map(v -> v + "").forEach(v -> System.out.println(v));
		Stream.of(values).map(v -> v + "").mapToInt(v -> v.length()).forEach(v -> System.out.println(v));
	}
}
