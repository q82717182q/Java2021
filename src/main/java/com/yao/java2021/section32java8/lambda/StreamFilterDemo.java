package com.yao.java2021.section32java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Jack Yao on 2022/1/25 11:37 PM
 */
public class StreamFilterDemo {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"apple",11000F));
        list.add(new Product(2,"banana",12000F));
        list.add(new Product(3,"cat",13000F));
        list.add(new Product(4,"dog",14000F));
        list.add(new Product(5,"egg",15000F));
        list.add(new Product(6,"fruit",16000F));
        list.add(new Product(7,"golf",17000F));
//        Stream<Product> filteredData = 
        list.stream().filter(p ->p.getPrice() > 14000).forEach(p->System.out.println(p));
    }
}
class Product{
	  int id ; 
	  String name;
	  float price;
	 
	 
	
	public Product() {
	}

	public Product(int id, String name, float price) {
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


