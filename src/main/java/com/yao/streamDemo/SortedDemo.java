package com.yao.streamDemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedDemo {
	public static void main(String[] args) {
		//ASC
		List<Integer> sortedAsc = Stream.of(120,24,59,63,11,74)
		                                .sorted()
		                                .collect(Collectors.toList());
		System.out.println("sorted asc: " + sortedAsc);
		//sorted asc: [11, 24, 59, 63, 74, 120]

		//DESC
		List<Integer> sortedDesc = Stream.of(120,24,59,63,11,74)
		                                .sorted((n1,n2) -> n2.compareTo(n1))
		                                .collect(Collectors.toList());
		System.out.println("sorted desc: " + sortedDesc);
		//sorted desc: [120, 74, 63, 59, 24, 11]
	}
}
