package com.hpf.study.springbootdemo;

import com.hpf.study.springbootdemo.model.Person;
import com.hpf.study.springbootdemo.model.User;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootDemoApplicationTests {

    @Autowired
    User user;

    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;



    @Test
    void contextLoads() {
        System.out.println(user.getName());
        System.out.println(person);
        System.out.println(ioc.containsBean("helloService"));


    }




}
