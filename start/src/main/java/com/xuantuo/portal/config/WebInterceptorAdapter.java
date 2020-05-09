package com.xuantuo.portal.config;

import com.xuantuo.portal.exception.ErrorInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/6
 **/
@Configuration
public class WebInterceptorAdapter implements WebMvcConfigurer {

//    @Bean
//    public ErrorInterceptor errorInterceptor() {
//        return new ErrorInterceptor();
//    }
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        //registry.addViewController("/error").setViewName("404.html");
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(errorInterceptor()).addPathPatterns("/**");
//    }
}
