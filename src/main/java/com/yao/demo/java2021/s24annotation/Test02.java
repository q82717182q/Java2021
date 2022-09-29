package com.yao.demo.java2021.s24annotation;

/**
 * Created by Jack Yao on 2022/2/16 10:24 PM
 */
public class Test02 {
    public static void main(String[] args) {
        testDeprecated();
    }

    //不方便程序員使用，因為有更好的方法。如果強烈需要使用也是可以的
    @Deprecated
    public static void testDeprecated(){
    }

    //從來沒用過會報警，不想出現報警就可以用註解，括號裡面要給值不然會報錯
    //all是把所有類型報警消除，也可以用特定類型
    //all與unused都可以，剩下自己查
    //也可以一次用多個作用域，現在是用method作用域當示範
//    @SuppressWarnings("all")
    @SuppressWarnings({"unused","deprecation"})
    public static void unusedMethod(){

    }

}
