package com.yao.demo.java2021.section32java8.L33stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
	public static void main(String[] args) {
		//FIXME 回家作業
		
		Random random = new Random();
		int[] list = random.ints(200_000_000).toArray();			//隨機生成兩億調數據

		System.out.println("Number of precessors: " + Runtime.getRuntime().availableProcessors());
	
		long startTime = System.currentTimeMillis();
		int[] list1 = IntStream.of(list).filter(e -> e>0).sorted().limit(5).toArray();
		System.out.println(Arrays.toString(list1));
		long endTime = System.currentTimeMillis();
		System.out.println("Sequential execution time is " + (endTime - startTime) + "milliseconds");
	
		//上面用串行
		
		//下面用並行，這邊能用，是因為這件事情本身就支持這樣做，也就是無狀態
		startTime = System.currentTimeMillis();
		int[] list2 = IntStream.of(list).parallel().filter(e -> e>0).sorted().limit(5).toArray();
		System.out.println(Arrays.toString(list2));
		endTime = System.currentTimeMillis();
		System.out.println("Sequential execution time is " + (endTime - startTime) + "milliseconds");
	
		
		
		
		
		
		
		
	
	}
}
