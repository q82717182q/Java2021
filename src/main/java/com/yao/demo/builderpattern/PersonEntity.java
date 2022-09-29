package com.yao.demo.builderpattern;
/*
 * @author Jack
 * @date 2022/7/20
 * 使用Builder模式
 * https://blog.csdn.net/lms1719/article/details/70741691
 * */


public class PersonEntity {
    private final int id;
    private final String name;
    private int age;
    private String sex;
    private String phone;
    private String address;
    private String desc;

    private PersonEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.phone = builder.phone;
        this.address = builder.address;
        this.desc = builder.desc;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int id;
        private String name;
        private int age;
        private String sex;
        private String phone;
        private String address;
        private String desc;

        public Builder() {
        }

        public Builder id (int val){
            this.id = val;
            return this;
        }
        public Builder name (String val){
            this.name = val;
            return this;
        }
        public Builder age (int val){
            this.age = val;
            return this;
        }
        public Builder sex (String val){
            this.sex = val;
            return this;
        }
        public Builder phone (String val){
            this.phone = val;
            return this;
        }
        public Builder address (String val){
            this.address = val;
            return this;
        }
        public Builder desc (String val){
            this.desc = val;
            return this;
        }
        public PersonEntity build(){
            return new PersonEntity(this);
        }
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
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
