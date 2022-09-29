package com.yao.demo.builderpattern.javabean;
/*
 * @author Jack
 * @date 2022/7/20
 * 使用javabeans的方式，要使用的方法較多
 * */

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(25);
        person.setName("Jack");
        person.setAge(31);
        person.setSex("male");
        person.setPhone("0987654321");
        person.setAddress("台北");
        person.setDesc("JavaBeans");
        System.out.println(person);
    }
}
