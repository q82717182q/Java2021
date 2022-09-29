package com.yao.designprinciples.dependencyinversion;
/*
 * @author Jack
 * @date 2022/7/26
 * */

public class Payment {
    public void pay(IPayment iPayment){
        iPayment.pay();
    }
}
