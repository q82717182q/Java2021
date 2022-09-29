package com.yao.demo.java2021.section32java8.lambda;

import java.util.Arrays;

public class ParallelArraySorting {
	public static void main(String[] args) {
		int[] arr = {5,8,1,0,6,9};
		for (int i : arr) {
			System.out.print(i + " ");
		}
//		Arrays.parallelSort(arr);
		Arrays.parallelSort(arr,1,3);
		System.out.println("\n Array elements after sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
