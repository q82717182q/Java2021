package com.yao.model;

public class ProductDto {
	private Integer id;
	private String name;
	private Integer price;
	private String description;
	private String color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ProductDto() {
	}
	public ProductDto(Integer id) {
		this.id = id;
	}
	public ProductDto(Integer id, String name) {
		this(id);
		this.name = name;
	}
	public ProductDto(Integer id, String name, Integer price) {
		this(id, name);
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public ProductDto(Integer id, String name, Integer price, String description) {
		this(id, name, price);
		this.description = description;
	}
	public ProductDto(Integer id, String name, Integer price, String description, String color) {
		this(id, name, price, description);
		this.color = color;
	}
	@Override
	public String toString() {
		return "ProductDto [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", color=" + color + "]";
	}
	
}
