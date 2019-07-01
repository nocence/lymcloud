package com.gkts.provider_dept_8002.service;



import com.gkts.lymcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    Dept findById(Integer id);

    List<Dept> findAll();
}
