package com.yao.configDemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jack Yao on 2022/3/22 9:54 AM
 */
@ConfigurationProperties(prefix = "com.yao.properties")
@Configuration("properties")
public class PropertiesDemo {
    private int id;
    private String name;

}
