package com.gkts.config_eureka_client_7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class ConfigEurekaClient7001Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaClient7001Application.class, args);
    }

}
