package com.yao.designprinciples.dependencyinversion;
/*
 * @author Jack
 * @date 2022/7/26
 * https://ianjustin39.github.io/ianlife/design-pattern/dependence-inversion-principle/
 * */

import org.springframework.beans.factory.annotation.Autowired;

public class Main {

    @Autowired
    private TestWithAutowired t;

    public static void main(String[] args) {

//        TestWithAutowired t = new TestWithAutowired();

        System.out.println("-------------------------0");


        //這樣用會多一個參數
//        IPayment creditCard = new CreditCard();
//        IPayment qRCode = new QRCode();
//        creditCard.pay();
//        qRCode.pay();

        System.out.println("-------------------------1");
        //少一個參數，可是要多做一個Payment
//        Payment p = new Payment();
//        p.pay(new CreditCard());
//        p.pay(new QRCode());


    }

}
