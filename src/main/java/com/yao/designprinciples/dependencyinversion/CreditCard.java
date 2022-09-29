package com.yao.designprinciples.dependencyinversion;

import org.springframework.stereotype.Component;

/*
 * @author Jack
 * @date 2022/7/26
 * */
@Component
public class CreditCard implements IPayment {
    @Override
    public void pay() {
        System.out.println("Pay with creditCard");
    }
}
