package com.yao.demo.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Jack Yao on 2022/3/10 4:34 PM
 */
public class ReflectionUserMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class class1 = Class.forName("com.yao.demo.reflection.User");
        System.out.println(class1);
        User user1 = (User)class1.newInstance();
        User user2 = (User)class1.newInstance();
        //user1.getClass()這邊是要直接給Class，而不是給實例，像這邊給用user1就會無法通過編譯
//        Method getIdMethod = user1.getMethod("getId");
        Method getIdMethod = class1.getMethod("getId");

        //setter的話第二個參數要記得給型別，不然會報NoSuchMethodException
        Method setIdMethod = user1.getClass().getMethod("setId", String.class);
        System.out.println("-----------0----------");
        System.out.println(getIdMethod.toString());

        System.out.println("-----------1----------");
        System.out.println(setIdMethod.toString());

        System.out.println("-----------2----------");
        //調用方法記得第一個參數是調用哪個實例，第二個參數是調用這個方法所要傳的參數
        setIdMethod.invoke(user1, "12345");
        System.out.println("user1 : " + user1.toString());

        System.out.println("-----------3----------");
        //user1.getClass()也可以直接用class1，意思是一樣的
        Method setIdMethod2 = class1.getMethod("setId", String.class);
        setIdMethod2.invoke(user2, "3345678");
        System.out.println("user2 : " + user2);

    }
}
