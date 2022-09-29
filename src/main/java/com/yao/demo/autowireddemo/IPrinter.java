package com.yao.demo.autowireddemo;
/*
 * @author Jack
 * @date 2022/7/26
 * */

import org.springframework.stereotype.Component;

@Component
public interface IPrinter {
    void print(String message);
}
