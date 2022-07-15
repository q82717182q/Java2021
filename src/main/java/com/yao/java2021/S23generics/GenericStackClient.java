package com.yao.java2021.S23generics;

/**
 * Created by Jack Yao on 2022/3/11 4:50 PM
 */
public class GenericStackClient {
    public static void main(String[] args) {
        //後面的尖括號可有可無，但是前面一定要有
        GenericStack<String> stack = new GenericStack<>();

        stack.push("AAAAA");
        stack.push("BBBBB");
        System.out.println("stack.peek() : " + stack.peek());
        System.out.println("stack.pop() : " + stack.pop());
        System.out.println("stack.peek() : " + stack.peek());
    }
}
