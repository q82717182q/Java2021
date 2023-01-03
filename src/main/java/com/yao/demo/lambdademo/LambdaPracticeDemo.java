package com.yao.demo.lambdademo;

import java.util.ArrayList;
import java.util.List;

public class LambdaPracticeDemo {
	public static void main(String[] args) {
		System.out.println("===========0=========== remove distinctByKey 針對物件裡的屬性去重複");
		Student s1 = new Student(1,"Jack");
		Student s2 = new Student(2,"Jacky");
		Student s3 = new Student(3,"Jack");
		Student s4 = new Student(4,"Jackyy");
		List<Student> sList = new ArrayList<>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		
	}
}

