package com.yao.demo.nullpointerdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		System.out.println(!list.isEmpty());
		System.out.println(list == null);
	}

}
