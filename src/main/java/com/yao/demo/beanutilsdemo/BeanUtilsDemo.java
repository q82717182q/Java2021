package com.yao.demo.beanutilsdemo;

import org.springframework.beans.BeanUtils;
import com.yao.model.Product;
import com.yao.model.ProductDto;

public class BeanUtilsDemo {
	public static void main(String[] args) {
		System.out.println("========== 0 ==========");
		Product p1 = new Product(1, "apple", 25, "Apple is good to keep from doctor.");
		ProductDto pDto1 = new ProductDto();
		BeanUtils.copyProperties(p1, pDto1);
		System.out.println(pDto1);
	}
}
