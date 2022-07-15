package com.yao.DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jack Yao on 2022/3/24 2:46 PM
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(new SimpleDateFormat().format(new Date()));
        System.out.println(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
    }
}
