package com.yao.ws;
/*
 * @author Jack
 * @date 2023/1/2
 * */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/helloworld")
    public void helloWorld(){
        System.out.println("Jack say hello world.");
    }



}
