package com.hpf.study.springbootdemo.config;

import com.hpf.study.springbootdemo.interceptor.CustormInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author hanpengfei1
 * @date 2020/3/18  20:37
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustormInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/index");

    }
}
