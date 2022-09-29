package com.yao.demo.autowireddemo;
/*
 * @author Jack
 * @date 2022/7/27
 * https://stackoverflow.com/questions/19896870/why-is-my-spring-autowired-field-null
 * new出來的物件不會丟給spring管理，所以要就是起springboot來管理
 * */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @Autowired
    private Teacher teacher;

//    public static void main(String[] args) {
//        Teacher teacher = new Teacher();//這樣new出來並不是給spring管理的bean所以會nullpointer
//        teacher.teach();
//
//
//    }

    @GetMapping("/autowiredtest")
    public void test(){
        teacher.teach();//要用這樣的方式使用spring管理的bean才不會nullpointer
    }

}
