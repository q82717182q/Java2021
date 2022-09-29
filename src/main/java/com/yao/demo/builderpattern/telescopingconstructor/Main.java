package com.yao.demo.builderpattern.telescopingconstructor;
/*
 * @author Jack
 * @date 2022/7/20
 * 使用telescopingconstructor，可讀性差
 */

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(25,"Jack",30,"male","0953111222", "三峽","測試重疊建構子");
        Person person2 = new Person(25,"Jack",30,"male","0953111222", "三峽");
        Person person3 = new Person(25,"Jack",30,"male","0953111222");
        Person person4 = new Person(25,"Jack",30,"male");
        Person person5 = new Person(25,"Jack",30);
        Person person6 = new Person(25,"Jack");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);
    }
}
