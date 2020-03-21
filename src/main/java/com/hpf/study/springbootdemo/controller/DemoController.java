package com.hpf.study.springbootdemo.controller;

import com.hpf.study.springbootdemo.common.GlobleException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanpengfei1
 * @date 2020/3/8  19:36
 */
@RestController
public class DemoController {

    @RequestMapping("hello")
    public String index() throws Exception {

        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new GlobleException();
        }

        return "hello world!!!";
    }

/*    @ExceptionHandler(GlobleException.class)
    @ResponseBody
    public String exceptionHandler(GlobleException e){

        return "DemoController处理异常";
    }*/

}
