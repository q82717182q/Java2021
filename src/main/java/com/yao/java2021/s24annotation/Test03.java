package com.yao.java2021.s24annotation;

import java.lang.annotation.*;

/**
 * Created by Jack Yao on 2022/2/17 10:10 PM
 */
//作用域要怎麼用點進去都有講解
@MyAnnotation//如果作用域只有ElementType.METHOD的話，註解放這邊會報錯，因為我們把這個註解作用域指定在方法上。除非作用域也加上類ElementType.TYPE
public class Test03 {
    //自定義註解
    public static void main(String[] args) {

    }

    @MyAnnotation//放這邊沒問題
    public void testAnnotation(){

    }
}

@Target(value = {ElementType.METHOD,ElementType.TYPE})//定義註解的目標，內容點進去可以看到是枚舉ElementType，這樣ElementType.METHOD就可以把註解用在method
@Retention(value = RetentionPolicy.CLASS)
@Documented
@Inherited
@interface MyAnnotation{

}