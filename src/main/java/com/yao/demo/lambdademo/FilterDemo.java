package com.yao.demo.lambdademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import org.hibernate.internal.build.AllowSysOut;

public class FilterDemo {
	public static void main(String[] args) {
		
		System.out.println("===========1=========== remove distinctByKey 針對物件裡的屬性去重複");
		Student s1 = new Student(1,"Jack");
		Student s2 = new Student(2,"Jacky");
		Student s3 = new Student(3,"Jack");
		Student s4 = new Student(4,"Jack");
		List<Student> sList = new ArrayList<>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.stream().filter(distinctByKey(e -> e.getName()))
		.forEach(student -> {System.out.println(student.getName());});
		
		System.out.println("===========1-1=========== remove distinctByKey 針對物件裡的屬性去重複");

		sList.stream().distinct()
		.forEach(student -> {System.out.println(student.getName());});
		
		System.out.println("===========0=========== remove duplicate");
		int[] ints = {1,1,2,2,3,3,3,4,4,4,4};
		Arrays.stream(ints).distinct().forEach(number -> {System.out.println("number : " + number);});
	}

	private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		Map<Object, Boolean> seen = new ConcurrentHashMap<>();
	      return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;

	}
	

	
}

class Student{
	private Integer id;
	private String name;
	
	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
