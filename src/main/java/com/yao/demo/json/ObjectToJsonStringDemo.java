package com.yao.demo.json;
/*
 * @author Jack
 * @date 2022/12/23
 * */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yao.model.Product;

public class ObjectToJsonStringDemo {
    public static void main(String[] args) throws JsonProcessingException {
        Product product = new Product();
        product.setId(25);
        product.setName("Jack");
        product.setDescription("Tall and handsome");
        product.setPrice(999999999);
        ObjectMapper mapper = new ObjectMapper();
        //Converting the Object to JSONString
        String jsonString = mapper.writeValueAsString(product);
        System.out.println(jsonString);
    }
}
