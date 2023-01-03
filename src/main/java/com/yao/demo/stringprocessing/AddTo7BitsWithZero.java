package com.yao.demo.stringprocessing;
/*
 * @author Jack
 * @date 2022/12/21
 * */

public class AddTo7BitsWithZero {
    public static void main(String[] args) {
//        String casNumber = "33992-49-3";
        String casNumber = "3440-75-3";
        String appendedNumber = "";
        String[] numbers = casNumber.split("-");
        StringBuilder builder = new StringBuilder();
        if (numbers[0].length() < 7){
            for (int i = 1; i < 7-numbers[0].length(); i++) {
                builder.append("0");
            }
            builder.append(numbers[0]).append("-").append(numbers[1]).append("-").append(numbers[2]);
        }
        appendedNumber = builder.toString();
        System.out.println(appendedNumber);
    }
}
