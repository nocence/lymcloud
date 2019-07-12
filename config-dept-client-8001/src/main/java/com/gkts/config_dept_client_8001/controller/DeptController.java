package com.gkts.config_dept_client_8001.controller;


import com.gkts.config_dept_client_8001.service.DeptService;
import com.gkts.lymcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value="/get/{id}",method= RequestMethod.GET)
    public Dept get(@PathVariable("id") Integer id) {
        return deptService.findById(id);
    }

    @RequestMapping(value="/list",method=RequestMethod.GET)
    public List<Dept> list() {
        return deptService.findAll();
    }
}
