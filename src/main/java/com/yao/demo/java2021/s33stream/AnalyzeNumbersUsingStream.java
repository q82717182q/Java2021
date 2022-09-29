package com.yao.demo.java2021.s33stream;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;

/**
 * Created by Jack Yao on 2022/2/11 10:59 AM
 */
public class AnalyzeNumbersUsingStream {
    //控制台提示用戶輸入數字，計算平均值，輸出這些數字大於平均值的數字有多少個
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//用Scanner來做輸入，指令用控制台輸入
        System.out.println("Enter the number of the items");
        int count = input.nextInt();
        double[] array = new double[count];
        for (int i = 0; i < count; i++){
            System.out.println("Enter number " + ( i + 1 ));
            array[i] = input.nextDouble();
        }
        System.out.println("You numbers are : " + Arrays.toString(array));
        //這邊是double所以要用DoubleStream
        double avg = DoubleStream.of(array).average().getAsDouble();
        System.out.println("Average is : " + avg);
        //用filter來判斷大於平均的數字，如果用傳統寫法就是用for迴圈來判斷，代碼就會多不少東西
        System.out.println("Number above average is : " + DoubleStream.of(array).filter(e -> e > avg).count());
    }


}
