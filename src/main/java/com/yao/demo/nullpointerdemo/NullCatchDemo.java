package com.yao.demo.nullpointerdemo;
/*
 * @author Jack
 * @date 2022/11/28
 * */

import com.yao.model.Product;

public class NullCatchDemo {
    public static void main(String[] args) {
        Product product1 = null;
        try {
            product1.getId();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
