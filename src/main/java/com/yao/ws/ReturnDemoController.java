package com.yao.ws;
/*
 * @author Jack
 * @date 2023/1/2
 * */

import com.yao.enums.ErrorMessageEnum;
import com.yao.model.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/return")
public class ReturnDemoController {


    @PostMapping("/productbypayload")
    public ResponseEntity<?> getProductByPayload(@RequestBody Product product){
        Product productResult = new Product();
        BeanUtils.copyProperties(product, productResult);
        return ResponseEntity.status(HttpStatus.OK).body(productResult);
    }

    @PostMapping("/productbypayloadreturn500")
    public ResponseEntity<Product> getProductByPayloadReturn500(@RequestBody Product product){
        Product productResult = new Product();
        BeanUtils.copyProperties(product, productResult);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(productResult);
    }

    @PostMapping("/productbypayloadreturnerrorenum")
    public ResponseEntity<?> getProductByPayloadReturnErrorEnum(@RequestBody Product product){ // need to return<?> to fit Enum
        Product productResult = new Product();
        BeanUtils.copyProperties(product, productResult);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ErrorMessageEnum.TEST_ERROR.toString());
    }

    @PostMapping("/productMap")
    public Product receiveRequestByMap(@RequestBody Map<String, Object> payload){
        Product product = new Product();
        product.setId((Integer) payload.get("id"));
        product.setName((String)payload.get("name"));
        return product;
    }


    @PostMapping("/productObject")
    public Product receiveRequestByProduct(@RequestBody Product product){//沒有 requestBody就不會自動par成物件
        Product product1 = new Product();
        product1.setId(product.getId());
        product1.setName(product.getName());
        return product1;
    }



}
