package com.yao.model;
/*
 * @author Jack
 * @date 2022/11/19
 * */

public class ProductFinalVersion {
     public final Integer id;
     public final String name;
     public final Integer price;

    public ProductFinalVersion(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProductFinalVersion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
