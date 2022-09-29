package com.yao.designprinciples.dependencyinversion;
/*
 * @author Jack
 * @date 2022/7/26
 * */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestWithAutowired {
    @Autowired
    private CreditCard creditCard;

    @Autowired
    private QRCode qRCode;

    public void payWithCreditCard(){
        creditCard.pay();
    }
    public void payWithQRCode(){
        qRCode.pay();
    }



}
