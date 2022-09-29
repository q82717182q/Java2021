package com.yao.demo.java2021.s20.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jack Yao on 2022/2/13 2:56 PM
 */
public class HomeWork2 {
    public static void main(String[] args) {

        //编写正则表达式程序，定义一个方法，方法的声明为public boolean isValidEmail(String email), 该方法检验email地址是否合法，合法返回true，否则返回false。
        //
        //运行示例：
        //
        //zsy@sina.com   true
        //
        //zsy@gmail.com   true
        //
        //zssdfgy#sina.com   false
        //
        //zsy@sina.@com   false
        System.out.println(isValidEmail("zsy@sina.com"));
        System.out.println(isValidEmail("zsy@gmail.com"));
        System.out.println(isValidEmail("zssdfgy#sina.com"));
        System.out.println(isValidEmail("zsy@sina.@com"));

        System.out.println("---------------------------------teacher");
        System.out.println(isValidEmailT("zsy@sina.com"));
        System.out.println(isValidEmailT("zsy@gmail.com"));
        System.out.println(isValidEmailT("zssdfgy#sina.com"));
        System.out.println(isValidEmailT("zsy@sina.@com"));
    }

    //老師版
    public static boolean isValidEmailT(String email){
        String mail="zsy@sina.com";
        String regex="\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3}){1,2}";//注意：这种匹配方式适用于国内部分邮件地址，不能匹配所有的邮件
        return mail.matches(regex);
    }

    public static boolean isValidEmail(String email) {

        Pattern pattern = Pattern.compile("\\w+@\\w+.com");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) return true;
        else return false;
    }
}
