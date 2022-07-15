package com.yao.java2021.s32lambda.exceptiondemo;
/*
 * @author Jack
 * @date 2022/7/15
 * */

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        Function<String, Integer> f = (String t) -> myWrappedMethod(t);
//        Function<String, Integer> f =
//                (String t) -> {
//                    try {
//                        return myMethod(t);
//                    }
//                    catch(IOException e) {
//                        throw new UncheckedIOException(e);
//                    }
//                };
    }
    void foo (CheckedFunction f) {  }


    public static Integer myMethod(String s){
        return null;
    }

    public static Integer myWrappedMethod(String s){
//        try {
//            return myMethod(s);
//        }catch (IOException e) {
//            throw new UncheckedIOException(e);
//        }
        return null;
    }
}
