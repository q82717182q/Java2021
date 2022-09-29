package com.yao.demo.testdemo;

import com.yao.demo.reflection.User;

/**
 * Created by Jack Yao on 2022/3/8 11:06 AM
 */
public class ThisConstructorDemo {
    public static void main(String[] args) {
        User user1 = new User("1");
        User user2 = new User("2","Jack");
        User user3 = new User("3","Jacky",25);
        User user4 = new User("4","Jackyy",30);
        System.out.println("user1 : " + user1);
        System.out.println("user2 : " + user2);
        System.out.println("user3 : " + user3);
        System.out.println("user4 : " + user4);
        systemOutPringln(user1);
        systemOutPringln(user2);
        systemOutPringln(user3);
        systemOutPringln(user4);
    }
    private static void systemOutPringln(User user) {
        if (user.getName() == null)
            return;
        System.out.println(user);
    }
}
