package com.yao.demo.optionaldemo;

import lombok.Data;

import java.util.Optional;

/**
 * Created by Jack Yao on 2022/2/27 2:29 PM
 */
@Data
public class Person {
    private Optional<Car> car;

}
