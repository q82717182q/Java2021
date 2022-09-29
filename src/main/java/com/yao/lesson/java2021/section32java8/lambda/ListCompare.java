package com.yao.lesson.java2021.section32java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCompare {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product(1,"jack",1.1F));
		list.add(new Product(2,"Catherine",2.2F));
		list.add(new Product(3,"jacky",3.3F));
		
		System.out.println("Sorting on the basis of name ..................");
		Collections.sort(list, (p1,p2)->{						//用 lambda方式排序
			return p1.getName().compareTo(p2.getName());
		});
		list.forEach((element)->System.out.println(element)); //用lambda方式印出來
		
	}
}

class Product{
	private int id;
	private String name;
	private float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
