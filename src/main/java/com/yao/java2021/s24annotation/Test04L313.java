package com.yao.java2021.s24annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Jack Yao on 2022/2/17 11:01 PM
 */
//定義註解與反射有關，可以幫助我們獲取註解，得到註解之後就可以獲取參數的值，這在框架是核心技術
public class Test04L313 {

    @MyAnnotation2//沒有給默認值這邊會報錯，有給就會覆蓋默認的值
    public void testAnnotation2(){

    }
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    String name() default "";
    int age() default 0;
    String[] schools() default {"Harard,Qinghua"};
}
