package com.gkts.lymcloud.serviceImpl;

import com.gkts.lymcloud.entities.Dept;
import com.gkts.lymcloud.service.DeptClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName DeptClientServiceFallbackFactory
 * @Description hystrix服务降级测试
 * @Author Innocence
 * @Date 2019/7/2 000217:08
 * @Version 1.0
 **/
@Component//不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(Integer id) {
                return new Dept().setDeptno(id)
                        .setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
