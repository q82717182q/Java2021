package com.yao.streamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelDemo {
	public static void main(String[] args) {
		List<Integer> randomNumbers = getRandomNumbers();
		sequential(randomNumbers);
		parallel(randomNumbers);
	}
	private static List<Integer> getRandomNumbers() {
	    List<Integer> randomNumbers = new ArrayList<>();
	    IntStream.range(0, 10000000)  // 依照個人電腦有所不同，以目前使用m1 air macbook要大於一千萬才有感
	            .forEach(n -> {
	                int rnd = (int)(Math.random() * 10000);
	                randomNumbers.add(rnd);
	            });
	    return randomNumbers;
	}

	//循序運算
	private static void sequential(List<Integer> randomNumbers) {
	    long start = System.nanoTime();
	    List<Integer> sorted = randomNumbers.stream().sequential().sorted().collect(Collectors.toList());
	    long end = System.nanoTime();
	    long duration = TimeUnit.NANOSECONDS.toMillis(end - start);
	    System.out.println("sequntial duration: " + duration + "(ms)");
	    //sequntial duration: 757(ms)
	}

	//並行運算
	private static void parallel(List<Integer> randomNumbers) {
	    long start = System.nanoTime();
	    List<Integer> sorted = randomNumbers.stream().parallel().sorted().collect(Collectors.toList());
	    long end = System.nanoTime();
	    long duration = TimeUnit.NANOSECONDS.toMillis(end - start);
	    System.out.println("parallel duration: " + duration + "(ms)");
	    //parallel duration: 535(ms)
	}
}
