package com.yao.demo.java2021.section32java8.L33stream;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReductionDemo {
	public static void main(String[] args) {
		int[] values = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};
		System.out.print("The values are ");
		IntStream.of(values).forEach(v -> System.out.print(v + " "));
		
		System.out.println("\n The result of multiplying all values is " 
		+ IntStream.of(values).parallel().reduce(1, (e1, e2) -> e1*e2));
		
		System.out.println("----------------------1-----------------");
		System.out.print("The values are " + 
		IntStream.of(values).mapToObj(e1 -> e1 + "").reduce((e1, e2) -> e1 + ", " + e2).get());


		System.out.print("\nThe values are " +
		IntStream.of(values).mapToObj(e1 -> e1 + "").reduce((e1, e2) -> e1 + ", " + e2));
		System.out.println("\n----------------------2-----------------");

		//FIXME 這樣不會有String相加效能不好的問題嗎?
		String[] names = {"John","Peter","Susan","Kim","Jen","George","Alan","Stacy","Michelle","john"};
		System.out.print("The names are " + 
		Stream.of(names).reduce((e1, e2) -> e1 + ", " + e2).get());

		System.out.println("\n----------------------3-----------------");
		System.out.println("Concat names : ");
		System.out.print("The names are " + 
		Stream.of(names).reduce((e1, e2) -> e1 + e2).get());

		System.out.println("\n----------------------3-----------------");
		System.out.println("Total number of characters : ");
		System.out.print("The names are " + 
		Stream.of(names).reduce((e1, e2) -> e1 + e2).get().length());

		
	}
}
