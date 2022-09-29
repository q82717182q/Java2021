package com.yao.demo.mathDemo;

import java.text.DecimalFormat;

/**
 * Created by Jack Yao on 2022/4/1 7:24 PM
 */
public class RoundNumber {
    public static void main(String[] args)
    {
        double val1 = 6482.236789;
        System.out.println("Double value: "+val1);

        DecimalFormat df1 = new DecimalFormat("###.##");
        DecimalFormat df2 = new DecimalFormat("###.#");
        DecimalFormat df3 = new DecimalFormat("#.##");
        DecimalFormat df4 = new DecimalFormat("#.#");
        System.out.println("Rounded Double value (DecimalFormat): "+df1.format(val1));
        System.out.println("Rounded Double value (DecimalFormat): "+df2.format(val1));
        System.out.println("Rounded Double value (DecimalFormat): "+df3.format(val1));
        System.out.println("Rounded Double value (DecimalFormat): "+df4.format(val1));
    }
}
