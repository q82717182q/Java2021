package com.yao.demo.java2021.section32java8.L33stream;

import java.util.Arrays;
import java.util.HashSet;

public class ListFilterCount {
	public static void main(String[] args) {
		Double[] doubles = {2.4,55.6,90.12,26.6};
		System.out.println("count is " +  new HashSet<>(Arrays.asList(doubles)).stream().filter(s->s>3).count());
	}
}

