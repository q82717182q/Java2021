package com.yao.optionaldemo;

import lombok.Data;

import java.util.Optional;

/**
 * Created by Jack Yao on 2022/2/27 10:59 AM
 */
@Data
public class Car {
    private int id;
    private String name;
    private Optional<Insurance> insurance;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
