package com.yao.demo.java2021.s32lambda.exceptiondemo;
/*
 * @author Jack
 * @date 2022/7/15
 * https://stackoverflow.com/questions/18198176/java-8-lambda-function-that-throws-exception
 * */

import java.io.IOException;

@FunctionalInterface
public interface CheckedFunction<T, R> {
    R apply(T t) throws IOException;
}
