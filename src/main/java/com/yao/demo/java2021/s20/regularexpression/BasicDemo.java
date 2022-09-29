package com.yao.demo.java2021.s20.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jack Yao on 2022/2/12 6:01 PM
 */

public class BasicDemo {
    public static void main(String[] args) {
        //compile()接受兩個參數 p1: 正則表達式得值，也就是定義好的匹配規則 p2:匹配參數，如大小寫不敏感
        //這邊用找Andrew來示範
        //Matcher進行查找匹配的結果都保存在此類裡面，
        //matcher()就可以返回Matcher的實例，裡面保存了進行查找匹配的結果

        //find()方法可以判斷找到了沒有
        Pattern pattern = Pattern.compile("Jack", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Jack programming!");
        boolean matchFound = matcher.find();
        System.out.println("matchFound : " + matchFound);
        if (matchFound){
            System.out.println("Match found");
        }else {
            System.out.println("not found");
        }
    }

}
