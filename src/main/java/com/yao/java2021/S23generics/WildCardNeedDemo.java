package com.yao.java2021.S23generics;

/**
 * Created by Jack Yao on 2022/3/22 11:49 AM
 */
//L306
public class WildCardNeedDemo {

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);

        //這邊出錯因為要傳入的是Number但是我們提供Integer，Integer是Number的子類，
        // 但對於GenericStack<Integer>並不是GenericStack<Number>的子類所以會出問題，所以這邊會用到通配泛型。
        // 這邊用受限通配

        System.out.println("The max number is : " + max(intStack));
    }
    public static double max(GenericStack<? extends Number> stack){
        double max = stack.pop().doubleValue();
        while (!stack.isEmpty()){
            double value = stack.pop().doubleValue();
            if (value > max){
                max = value;
            }
        }
        return max;
    }
}
