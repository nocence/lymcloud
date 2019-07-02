package com.gkts.consumer_dept_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.gkts.lymcloud"})
@ComponentScan("com.gkts")//服务降级是一定要加，不然扫描不到api的
public class ConsumerDeptFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptFeignApplication.class, args);
    }

}
