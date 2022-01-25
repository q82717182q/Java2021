package com.yao.java2021.section32java8.lambda;


import com.yao.java2021.section32java8.lambda.po.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Jack Yao on 2022/1/25 11:37 PM
 */
public class StreamFilterDemo {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new Product(1,"apple",11000F));
        list.add(new Product(2,"banana",12000F));
        list.add(new Product(3,"cat",13000F));
        list.add(new Product(4,"dog",14000F));
        list.add(new Product(5,"egg",15000F));
        list.add(new Product(6,"fruit",16000F));
        list.add(new Product(7,"golf",17000F));
        System.out.println(list);

//        Stream<Product> asdf = list.stream().filter(p -> p.)
//        Stream<Product> filteredData = list.stream().filter(p -> p > 20000);


    }
}


