package com.yao.isChangedByMethodDemo;

/**
 * Created by Jack Yao on 2022/3/17 4:11 PM
 */
public class DeadCodeStringDemo {
    private static String sAll = "CCC";
    public static void main(String[] args) {
        //String在方法間傳遞是複製一個自己，傳到另一個方法，所以在其他方法改變的時候也只是改變複製品，不是改變本身
        Boolean b1 = false;
        String s1 = "Jackyyyyy";



        changeStringAndBoolean(s1,b1);


        if (b1 != false){
            System.out.println("b1 is true!");
        }

        System.out.println("s1 : " + s1);
        System.out.println("s1 : " + s1.hashCode());
        if (s1 != null){
            System.out.println("s1 is not empty!");
        }
        System.out.println("sAll : " + sAll);

    }

    private static void changeStringAndBoolean(String s1, Boolean b1) {
        s1 = "Jack";
        System.out.println("s1 in changeString(String s1) is : " + s1);
        System.out.println("s1 in changeString(String s1) is : " + s1.hashCode());

        System.out.println(s1 == sAll);

    }
}
