package com.gkts.provider_dept_hystrix_8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class ProviderDeptHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDeptHystrix8001Application.class, args);
    }

}
