package com.yao.demo.autowireddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
 * @author Jack
 * @date 2022/7/27
 * */
@Service
public class Teacher {
    @Autowired
    private IPrinter printer;

    public void teach(){
        printer.print("I'm a teacher.");
    }
}
