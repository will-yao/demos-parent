package com.xuantuo.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/5
 **/
@SpringBootApplication(scanBasePackages = {"com.xuantuo.*"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
