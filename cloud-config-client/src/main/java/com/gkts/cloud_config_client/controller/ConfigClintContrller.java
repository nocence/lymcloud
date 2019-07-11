package com.gkts.cloud_config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigClintContrller
 * @Description TODD
 * @Author Innocence
 * @Date 2019/7/11 001116:30
 * @Version 1.0
 **/
@RestController
public class ConfigClintContrller {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig()
    {
        String str = "applicationName: "+applicationName+"\t eurekaServers:"+eurekaServers+"\t port: "+port;
        System.out.println("******str: "+ str);
        return "applicationName: "+applicationName+"\t eurekaServers:"+eurekaServers+"\t port: "+port;
    }
}

