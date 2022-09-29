package com.yao.demo.java2021.s33stream;

import lombok.Data;

import java.util.ArrayList;

/**
 * Created by Jack Yao on 2022/3/4 11:21 PM
 */
public class StreamFilterAndForeachDemo {
    public static void main(String[] args) {

        Student s1 = new Student(1,"Jack",50);
        Student s2 = new Student(1,"Jack1",70);
        Student s3 = new Student(1,"Jack2",80);
        Student s4 = new Student(1,"Jack4",90);
        ArrayList<Student> sList = new ArrayList<>();
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        sList.add(s4);
//        sList.stream().filter(e -> e.getScore() > 60).findAny().ifPresent(e ->{
//                throw new RuntimeException();
//        });
    }
}

@Data
class Student{
    private int id;
    private String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
}
