package com.gkts.lymcloud.service;

import com.gkts.lymcloud.entities.Dept;

import com.gkts.lymcloud.serviceImpl.DeptClientServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    Dept get(@PathVariable("id") Integer id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    List<Dept> list();
}
