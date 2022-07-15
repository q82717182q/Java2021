package com.yao.java2021.s20.regularexpression;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jack Yao on 2022/2/12 6:27 PM
 */
public class MatchPatternDemo {
    public static void main(String[] args) {
        //正則表達式用模糊匹配比較多
        //反而比較少用精確匹配
        //不包含第一格斜線 \d代表字元 digital 後面大括號11表示是出現11次，也就是出現11次英文字才是匹配的，
        //java要求就是要用模糊匹配的話要在斜線之前再加上一個斜線也就是用雙斜線，也可以當成java就是要雙斜線開頭才能模糊匹配
        //元字符https://www.runoob.com/regexp/regexp-metachar.html
        Pattern pattern = Pattern.compile("\\d{11}", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern.matcher("0953214010");
        Matcher matcher2= pattern.matcher("09532140101");

        System.out.println("-------------0--------------");
        System.out.println(matcher1.find());
        System.out.println("-------------1--------------");
        System.out.println(matcher2.find());

        //匹配常用字符，英文、數字、下劃線  \w
        //https://regex101.com/   這邊透過此網站說明

        //匹配空格字符        \s
        // 匹配非數字 010-12345678     \d{3}-\d{8}
        //匹配所有010開頭的號碼 010-\d{8}
        //匹配開頭與結尾
        //重複匹配

    }
}
