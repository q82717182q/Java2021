//package com.yao.java2021.s32lambda;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//import com.yao.java2021.section32java8.lambda.po.Product;
//
//public class ListCompare {
//
//	public static void main(String[] args) {
//
//		List<Product> list = new ArrayList<>();
//		list.add(new Product(1,"jack",1.1F));
//		list.add(new Product(2,"Catherine",2.2F));
//		list.add(new Product(3,"jacky",3.3F));
////
//		System.out.println("Sorting on the basis of name ..................");
//		Collections.sort(list, (p1,p2)->{						//用 lambda方式排序
//			return p1.getName().compareTo(p2.getName());
//		});
//		list.forEach((element)->System.out.println(element)); //用lambda方式印出來
//
//	}
//}
//
