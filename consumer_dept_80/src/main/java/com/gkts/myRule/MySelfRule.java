package com.gkts.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MySelfRule
 * @Description 自定义Ribbon负载均衡算法类
 * @Author Innocence
 * @Date 2019/7/1 000115:30
 * @Version 1.0
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule()
    {
//        return new RandomRule();//Ribbon默认是轮询，我自定义为随机
        return new RandomRuleDiy();//调用自定义的轮询算法
    }
}
