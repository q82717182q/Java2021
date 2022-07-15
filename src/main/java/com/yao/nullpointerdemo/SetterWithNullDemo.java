package com.yao.nullpointerdemo;

import com.yao.reflection.User;

import java.util.Optional;

/**
 * Created by Jack Yao on 2022/3/28 3:12 PM
 */
public class SetterWithNullDemo {

    public static void main(String[] args) {
        User user1 = new User();
        String name = "m/n3";
        Double d1 = 12.3;
        user1.setId("123");

        user1.setName(name);
        user1.setScore(Optional.ofNullable(d1).orElse(0.0));
        System.out.println(user1);
        System.out.println(user1.getScore() + user1.getName());
        user1.setName(user1.getScore() + user1.getName());
        System.out.println(user1);
    }

}
