package com.yao.demo.thisdemo;
/*
 * @author Jack
 * @date 2022/7/21
 *
 * */

public class Main {
    public static void main(String[] args) {
        TestThis t = new TestThis(1,"Jack");
        System.out.println(t.testA()
                .testB());//測試return this與return new 的雜湊值。結果不同，this才能維持原本的雜湊值，也就是一直用同一個物件去繼續調用接下來的方法

        System.out.println(t + " ---------t in Main");
    }
}
