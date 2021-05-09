package com.hpf.study.springbootdemo.config;

import com.hpf.study.springbootdemo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hanpengfei1
 * @date 2020/3/13  22:53
 */
@Configuration    // 指明当前是一个配置类，相当于之前的配置文件。
public class MyAppConfig {
    @Bean
    public HelloService helloService(){//用方法名作为 bean id
        return new HelloService(1);
    }
}
