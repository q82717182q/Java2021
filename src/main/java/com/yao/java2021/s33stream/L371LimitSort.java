package com.yao.java2021.s33stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Stream;

public class L371LimitSort {
	public static void main(String[] args) {
		//十個名字 John重複
		String[] names = {"John","Peter","Susan","Kim","Jen","George","Alan","Stacy","Michelle","john"};
		String[] namesJ = {"John","Peter","Susan","Kim","Jen","George","Alan","Stacy","Michelle","John"};
		
		System.out.println("\n----------------- -2-----------------//去重複 HashSet不保證順序   George, Jen, Michelle, Stacy,");
		//去重複 HashSet不保證順序   George, Jen, Michelle, Stacy,
		new HashSet<>(Arrays.asList(names)).stream().forEach(n->System.out.print(n + ", "));
		
		System.out.println("\n----------------- -1-----------------去重複之後還是可以用 sort排序");
		//去重複之後還是可以用 sort排序
		new HashSet<>(Arrays.asList(names)).stream().sorted().forEach(n->System.out.print(n + ", "));

		System.out.println("\n-----------------0-----------------sorted");
		//排序 sorted
		Stream.of(names).sorted().forEach(e -> System.out.print(e + ","));
		
		System.out.println("\n-----------------1-----------------取前四個再次排序，反過來做，結果會不同");
		//需求一：取前四個再次排序，反過來做，結果會不同
		Stream.of(names).limit(4).sorted().forEach(n->System.out.print(n + ", "));
		System.out.println("\n");
		Stream.of(names).sorted().limit(4).forEach(n->System.out.print(n + ", "));


//		System.out.println("\n-----------------2-----------------");
//		//String陣列裝到list 不影響順序
//		System.out.println(Arrays.asList(names));

		System.out.println("\n-----------------3-----------------用TreeSet，會先排好所以也不一樣");
		//用TreeSet，會先排好所以也不一樣
		new TreeSet<>(Arrays.asList(names)).stream().limit(4).forEach(n->System.out.print(n + ", "));
		
//		System.out.println("\n-----------------3.1-----------------");
//		new TreeSet<>(Arrays.asList(names)).stream().limit(4).sorted().forEach(n->System.out.print(n + ", "));
//		
		System.out.println("\n-----------------4-----------------跳過前四個，忽略字母大小寫的排序，這兩種用法一樣");
		//需求二：跳過前四個，忽略字母大小寫的排序，這兩種用法一樣
		Stream.of(names).skip(4).sorted((e1,e2)->e1.compareToIgnoreCase(e2)).forEach(n->System.out.print(n + ", "));
		System.out.println("\n-----------------4.1-----------------");
		Stream.of(names).skip(4).sorted(String::compareToIgnoreCase).forEach(n->System.out.print(n + ", "));
		
		System.out.println("\n-----------------5-----------------沒有忽略大小寫得排序");
		//沒有忽略大小寫得排序
		Stream.of(names).skip(4).sorted().forEach(n->System.out.print(n + ", "));

		System.out.println("\n-----------------7-----------------查找元素 anyMach");
		//需求三：查找元素 anyMach
		System.out.println(Stream.of(names).anyMatch(n->n.equals("Stacy")));
		
		System.out.println("-----------------8-----------------看陣列是否全部大寫開頭");
		//需求四：看陣列是否全部大寫開頭
		System.out.println(Stream.of(names).allMatch(n->Character.isUpperCase(n.charAt(0))));
		
		System.out.println("-----------------9-----------------沒有Ko開頭");
		//需求五：沒有Ko開頭
		System.out.println(Stream.of(names).noneMatch(n->n.startsWith("Ko")));
		
		System.out.println("-----------------10-----------------不區分大小寫，不重複的有幾個。");
		//需求六：不區分大小寫，不重複的有幾個。這邊透過map把全部轉成大寫， 再來比較。
		System.out.println(Stream.of(names).map(n->n.toUpperCase()).distinct().count());
		
		System.out.println("-----------------11-----------------把所有元素轉小寫並輸出");
		//需求七：把所有元素轉小寫並輸出
		Stream.of(names).map(n->n.toLowerCase()).forEach(n->System.out.print(n+ ", "));
		
//		System.out.println("\n-----------------12-----------------");
//		Object[] array = Stream.of(names).map(String::toLowerCase).toArray();
//		System.out.println(Arrays.toString(array));
		
	}
}
