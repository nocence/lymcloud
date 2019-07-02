package com.gkts.provider_dept_hystrix_8001.controller;


import com.gkts.lymcloud.entities.Dept;
import com.gkts.provider_dept_hystrix_8001.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value="/get/{id}",method= RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "hystrixTestToGetMethod")
    public Dept get(@PathVariable("id") Integer id) {
        Dept dept = deptService.findById(id);
        if (dept == null){
            throw new RuntimeException("该ID"+id+"没有对应的信息");
        }
        return dept;
    }

    public Dept hystrixTestToGetMethod(@PathVariable("id") Integer id){
        Dept dept = new Dept()
                .setDeptno(id)
                .setDname("该ID" + id + "没有对应的信息。——from Hystrix")
                .setDb_source("no this database in MySQL");
        return dept;
    }

}
