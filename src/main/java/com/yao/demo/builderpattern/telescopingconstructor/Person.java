package com.yao.demo.builderpattern.telescopingconstructor;
/*
 * @author Jack
 * @date 2022/7/20
 * 使用telescopingconstructor，可讀性差
 * 这个构造器调用通常需要许多你本不想设置的参数，但还是不得不为它们传递值。
 * 重叠构造器可行，但是当有许多参数的时候，创建使用代码会很难写，并且较难以阅读。
 * */

public class Person {
    private final int id;
    private final String name;
    private final int age;
    private final String sex;
    private final String phone;
    private final String address;
    private final String desc;
    public Person(int id, String name) {
        this(id,name,0);
    }
    public Person(int id, String name, int age) {
        this(id,name,age,"");
    }
    public Person(int id, String name, int age, String sex) {
        this(id,name,age,sex,"");
    }
    public Person(int id, String name, int age, String sex, String phone) {
        this(id,name,age,sex,phone,"");
    }
    public Person(int id, String name, int age, String sex, String phone, String address) {
        this(id,name,age,sex,phone,address,"");
    }

    public Person(int id, String name, int age, String sex, String phone, String address, String desc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
