package com.yao.demo.finaldemo;
/*
 * @author Jack
 * @date 2022/11/19
 * */

import com.yao.model.ProductFinalVersion;

public class FinalDemo {
    public static void main(String[] args) {
        ProductFinalVersion product = new ProductFinalVersion(1,"Iphone",25000);
        System.out.println(product);
        System.out.println("===========0==========");
//        product.price = 12500;//Cannot assign a value to final variable 'price'
    }
}
