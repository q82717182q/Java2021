package com.yao.java2021.s33stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class L372IntStream {

	public static void main(String[] args) {
		int[] values = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};
		System.out.println("\n-----------------0-----------------獲取values陣列佔幾位數");
		System.out.println("The number of digits in array values is " + Stream.of(values).map(v -> v + "").mapToInt(v -> v.length()).sum());
	
		System.out.println("\n-----------------0-----------------不重複且大於三的偶數平均  (4 + 6 + 20)/3 = 10");
		System.out.println(IntStream.of(values).distinct().filter(v -> v> 3 && v % 2 == 0).average().getAsDouble());
		
		System.out.println("\n-----------------1-----------------取前四碼總和s");
		System.out.println("The sum of the first 4 numbers is " + IntStream.of(values).limit(4).sum());
		
		System.out.println("\n-----------------2-----------------Stream max min ");
		//max: 120
		int max = Stream.of(120, 24, 59, 63, 11, 74).max(Comparator.comparing(n -> n)).get();
		System.out.println("max: " + max);

		//min: 11
		int min = Stream.of(120, 24, 59, 63, 11, 74).min(Comparator.comparing(n -> n)).get();
		System.out.println("min: " + min);
		
		System.out.println("\n-----------------2.1-----------------IntSummaryStatistics 獲得統計值，有最大、最小、平均、總和、計次、");
		IntSummaryStatistics statictics = IntStream.of(values).summaryStatistics();
		System.out.println("Max is " + statictics.getMax());
		System.out.println("Min is " + statictics.getMin());
		System.out.println("Average is " + statictics.getAverage());
		System.out.println("Count is " + statictics.getCount());
		System.out.println("Sum is " + statictics.getSum());
		System.out.println("Class is " + statictics.getClass());

		System.out.println("\n-----------------3-----------------獲取所有元素字長總和");
		String[] names = {"John","Peter","Susan","Kim","Jen","George","Alan","Stacy","Michelle","john"};
		System.out.println(Stream.of(names).mapToInt(n -> n.length()).sum());
		System.out.println(Stream.of(names).mapToInt(n -> n.length()).sum());
		
//		
//		
//		System.out.println("\n-----------------4-----------------");
//		//獲取values
//		//FIXME 怎麼弄都不是11勒真奇怪
//		System.out.println("The number of digits in array values is " + Stream.of(values).map(v -> v + "").mapToInt(v -> v.length()).sum());
//
//		Stream.of(values).map(v -> v + "").forEach(v -> System.out.println(v));
//		Stream.of(values).map(v -> v + "").mapToInt(v -> v.length()).forEach(v -> System.out.println(v));
	}
}

