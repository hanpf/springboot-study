package com.hpf.study.springbootdemo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author hanpengfei1
 * @date 2020/3/18  20:33
 */
public class CustormInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        System.out.println("拦截器处理逻辑.......");
        return true;
    }
}
