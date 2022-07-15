package com.yao.java2021.S23generics;

/**
 * Created by Jack Yao on 2022/3/23 9:09 AM
 */
public class AnyWildCardDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);

        print(intStack);
    }

    //print(GenericStack<?> stack) 這個<?>等價於<? extends Object>，這是非受限通配，可以放任何類型的願宿
    //print(GenericStack<Object>這樣就會出錯，因為GenericStack<Integer>並不是GenericStack<Object>的子類所以會出問題。
    //把整個GenericStack<?>當作一個類型來看，<? extends Object>代表所有繼承Object的型別都可以用
    public static void print(GenericStack<?> stack){
        while (!stack.isEmpty()){
            System.out.println(stack.pop() + " ");
        }
    }
}
