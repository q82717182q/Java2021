package com.yao.demo.java2021.S23generics;

/**
 * Created by Jack Yao on 2022/3/23 9:16 AM
 */
public class SuperWildCardDemo {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        stack2.push("Java");
        stack2.push(2);
        stack1.push("Sun");
        add(stack1, stack2);
        AnyWildCardDemo.print(stack2);

    }

    //這邊用到下限通配，說明stack1是stack2的子類，所以這樣就可以把stack1的元素放到stack2裡面
    //GenericStack<T> stack2如果只是這樣用一樣會出錯，跟前面道理一樣，雖然String是Object的子類，但是GenericStack<String>不是GenericStack<Object>的子類
    private static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2) {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }

}
