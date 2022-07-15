package com.yao.java2021.s20.regularexpression;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jack Yao on 2022/2/13 1:37 PM
 */
public class SearchAndReplace {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy dog.";
        Pattern p = Pattern.compile("\\wo\\w");//o左右邊各有一個字
        Matcher m = p.matcher(s);
        while (m.find()){
            String sub = s.substring(m.start(), m.end());//用substring來輸出匹配到的結果
            System.out.println(sub);
        }
        System.out.println("-------------0--------------");

        //把不合規範的多個空格通通替換成一個空格
        String s1 = "The     quick\t\t brown     fox   jumps    over the   lazy dog.";
        String r = s1.replaceAll("\\s+", " "); //把所有匹配到的字替換掉 p1:需要被替換的字 p2:替換成這個字
        System.out.println(r);//The quick brown fox jumps over the lazy dog.
        System.out.println("-------------1--------------");

        //反向引用，把包含四個字符的單詞找出來
        //使用<b>把單詞包裹起來
        String s2 = "the quick brown fox jumps over the lazy dog.";
        //單字兩邊有空格用\\s
        //匹配出來的結果可以直接拿來用就是$1
        String r2 = s2.replaceAll("\\s([a-z]{4})\\s", " <b>$1</b> ");
        System.out.println(r2);

        System.out.println("-------------2--------------");

    }
}
