package com.yao.demo.autowireddemo;
/*
 * @author Jack
 * @date 2022/7/26
 * */

import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements IPrinter{
    @Override
    public void print(String message) {
        System.out.println("HP印表機" + message);
    }
}
