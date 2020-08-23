package com.hpf.study.springbootdemo;

import com.hpf.study.springbootdemo.factory.YamlPropertySourceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@ImportResource(locations = {"classpath:beans.xml"})
@PropertySource(value = "classpath:person.yml",factory = YamlPropertySourceFactory.class)

public class SpringbootDemoApplication {
        //测试回滚
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
