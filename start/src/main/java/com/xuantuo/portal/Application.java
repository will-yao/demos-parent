package com.xuantuo.portal;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/5
 **/
@SpringBootApplication(scanBasePackages = {"com.xuantuo.*"})
@NacosPropertySource(groupId = "fh-oms", dataId = "oms", autoRefreshed = true)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
