package com.gkts.config_dept_client_8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigDeptClient8001Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigDeptClient8001Application.class, args);
    }

}
