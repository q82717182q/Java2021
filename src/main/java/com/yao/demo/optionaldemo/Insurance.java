package com.yao.demo.optionaldemo;

import lombok.Data;

import java.util.Optional;

/**
 * Created by Jack Yao on 2022/2/27 2:29 PM
 */
@Data
public class Insurance {
    private int id;
    private String name;

    public Insurance() {
    }

    public Insurance(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
