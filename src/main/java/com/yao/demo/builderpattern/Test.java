package com.yao.demo.builderpattern;
/*
 * @author Jack
 * @date 2022/7/20
 * https://blog.csdn.net/lms1719/article/details/70741691
 * */


public class Test {
    public static void main(String[] args) {
        //new 物件裡面做好的builder出來，之後塞參數，最後build()呼叫此物件的建構子
        PersonEntity person1 = PersonEntity.builder().id(25).name("Jack").build();

        PersonEntity person2 = PersonEntity.builder().id(25).name("Jack").age(31).sex("male").phone("09876543421").address("台北").desc("BuilderPattern").build();

        System.out.println(person2);
        System.out.println("\n-----------------------------1\n");

        PersonDTO dto = new PersonDTO.Builder().id(123).name("John").build();
        PersonEntity personEntity = PersonDTO.convertToEntity(dto);

        System.out.println(dto);
        //builder也可以拿來copyProperty
        System.out.println(personEntity);

    }
}
