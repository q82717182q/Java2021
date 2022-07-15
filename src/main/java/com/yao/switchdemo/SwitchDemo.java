package com.yao.switchdemo;

/**
 * Created by Jack Yao on 2022/3/30 4:42 PM
 */
public class SwitchDemo {
    public static void main(String[] args) {
        String predictorString = "局部排氣";
        Double predictor = 0.0;
        switch (predictorString) {
            case "局限空間/無通風":
                predictor = 0.1;
                break;
            case "通風不良":
                predictor = 0.01;
                break;
            case "整體換氣":
                predictor = 0.001;
                break;
            case "局部排氣":
                predictor = 0.0001;
                break;
            case "密閉作業":
                predictor = 0.00001;
                break;
        }
        System.out.println("predictor : " + predictor);
    }
}
