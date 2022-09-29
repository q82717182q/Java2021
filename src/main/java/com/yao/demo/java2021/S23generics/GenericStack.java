package com.yao.demo.java2021.S23generics;

import java.util.ArrayList;

/**
 * Created by Jack Yao on 2022/3/11 4:11 PM
 */
//這是一個棧，這邊的<E>一定要有，把它定義為泛型類，不然內容都不能用E，會報錯
public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize()-1);
    }

    //元素丟到棧裡面的方法
    public void push(E element){
        list.add(element);
    }
    //pop方法返回目前棧頂的元素，並且刪除掉
    public E pop(){
        E element = list.get(getSize()-1);
        list.remove(getSize()-1);
        return element;
    }


    public boolean isEmpty() {
        return false;
    }
}
