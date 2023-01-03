package com.yao.model;

public class Product {
	private Integer id;
	private String name;
	private Integer price;
	private String description;
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Product() {
	}
	public Product(Integer id) {
		this.id = id;
	}
	public Product(Integer id, String name) {
		this(id);
		this.name = name;
	}
	public Product(Integer id, String name, Integer price) {
		this(id, name);
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product(Integer id, String name, Integer price, String description) {
		this(id, name, price);
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	
}
