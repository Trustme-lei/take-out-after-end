package com.jy.take.handle.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 雷升
 * @date 2020/4/11 20:49
 */

@Configuration
public class Comparator implements WebMvcConfigurer {
    CheckParamsInterceptor checkSourceInterceptor = new CheckParamsInterceptor();


   /**
    *增加校验拦截器
    */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 这个地方可以定义拦截器的具体的路径
        registry.addInterceptor(checkSourceInterceptor).addPathPatterns("/**");


    }
}