package com.yao.java2021.section32java8.lambda.po;

/**
 * Created by Jack Yao on 2022/1/25 11:40 PM
 */
public class Product {
    public int id;
    public String name;
    public float price;
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
