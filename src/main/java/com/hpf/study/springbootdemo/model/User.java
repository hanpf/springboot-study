package com.hpf.study.springbootdemo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author hanpengfei1
 * @date 2020/3/13  21:40
 */
@Component
//@ConfigurationProperties(prefix = "hpf")
public class User {

    @Value("${hpf.name}")
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
