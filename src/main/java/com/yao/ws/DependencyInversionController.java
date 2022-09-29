package com.yao.ws;
/*
 * @author Jack
 * @date 2022/7/26
 * */

import com.yao.designprinciples.dependencyinversion.TestWithAutowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyInversionController {

    @GetMapping("/test")
    public void test(){
        TestWithAutowired t = new TestWithAutowired();
        System.out.println("----------------in spring boot");
        t.payWithCreditCard();
        t.payWithQRCode();
    }
}
