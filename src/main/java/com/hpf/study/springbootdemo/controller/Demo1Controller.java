package com.hpf.study.springbootdemo.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanpengfei1
 * @date 2020/3/8  19:36
 */
@RestController
public class Demo1Controller {

    @RequestMapping("hello1")
    public String index() throws Exception {

        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new Exception();
        }

        return "hello world!!!";
    }



}
