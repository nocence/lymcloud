package com.gkts.provider_dept_8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderDept8002Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDept8002Application.class, args);
    }

}
