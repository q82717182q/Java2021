package com.yao.demo.builderpattern.telescopingsetter;
/*
 * @author Jack
 * @date 2022/7/21
 * */

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(25).setName("Jack").setAge(30).setDesc("愛喝可樂");
        System.out.println(person);

    }
}
