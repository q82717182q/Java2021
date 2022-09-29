package com.yao.demo.java2021.section32java8.L33stream;

import java.awt.geom.Ellipse2D;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Stream;

import org.hibernate.internal.build.AllowSysOut;

public class LimitSort {
	public static void main(String[] args) {
		String[] names = {"John","Peter","Susan","Kim","Jen","George","Alan","Stacy","Michelle","john"};
		//順序怪怪的?因為HashSet不保證順序   George, Jen, Michelle, Stacy, 
		new HashSet<>(Arrays.asList(names)).stream().limit(4).sorted().forEach(n->System.out.print(n + ", "));
		
		System.out.println("\n-----------------1-----------------");
		//需求一：這邊才是取前四個
		Stream.of(names).limit(4).sorted().forEach(n->System.out.print(n + ", "));

		System.out.println("\n-----------------2-----------------");
		//不影響順序
		System.out.println(Arrays.asList(names));
		
		System.out.println("\n-----------------3-----------------");
		//用這個，會先排好所以也不一樣
		new TreeSet<>(Arrays.asList(names)).stream().limit(4).sorted().forEach(n->System.out.print(n + ", "));
		System.out.println("\n-----------------4-----------------");
		//需求二：跳過前四個方法，忽略字母大小寫的排序
		Stream.of(names).skip(4).sorted((e1,e2)->e1.compareToIgnoreCase(e2)).forEach(n->System.out.print(n + ", "));
		System.out.println("\n-----------------5-----------------");
		//沒有忽略大小寫
		Stream.of(names).skip(4).sorted().forEach(n->System.out.print(n + ", "));
		System.out.println("\n-----------------6-----------------");
		//另一個比較大小的寫法
		Stream.of(names).skip(4).sorted(String::compareToIgnoreCase).forEach(n->System.out.print(n + ", "));
		System.out.println("\n-----------------7-----------------");
		//需求三：查找元素 anyMach
		System.out.println(Stream.of(names).anyMatch(n->n.equals("Stacy")));
		System.out.println("-----------------8-----------------");
		//需求四：看陣列是否全部大寫
		System.out.println(Stream.of(names).allMatch(n->Character.isUpperCase(n.charAt(0))));
		System.out.println("-----------------9-----------------");
		//需求五：沒有Ko開頭
		System.out.println(Stream.of(names).noneMatch(n->n.startsWith("Ko")));
		System.out.println("-----------------10-----------------");
		//需求六：不區分大小寫，不重複的有幾個。這邊透過map把全部轉成大寫， 再來比較。
		System.out.println(Stream.of(names).map(n->n.toUpperCase()).distinct().count());
		System.out.println("-----------------11-----------------");
		//需求七：把所有元素轉小寫並輸出
		Stream.of(names).map(n->n.toLowerCase()).forEach(n->System.out.print(n+ ", "));
		System.out.println("\n-----------------12-----------------");
		Object[] array = Stream.of(names).map(String::toLowerCase).toArray();
		System.out.println(Arrays.toString(array));
	}
}
