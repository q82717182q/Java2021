package com.yao.demo.thisdemo;
/*
 * @author Jack
 * @date 2022/7/21
 * */

public class TestThis {
    private int id;
    private String name;

    public TestThis() {
    }

    public TestThis(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestThis{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public TestThis testA(){
        System.out.println("vvvvvvvvvvtestAvvvvvvvvvvv");
        System.out.println(this);
        System.out.println(this + " ---------this in testA");
//        return this;  //正常要這樣使用
        return new TestThis();//這樣做回傳的物件是新的，內容也會是新的
    }
    public TestThis testB(){
        System.out.println("vvvvvvvvvvtestBvvvvvvvvvvv");
        System.out.println(this + " ---------this in testB");
        return this;
    }
}
