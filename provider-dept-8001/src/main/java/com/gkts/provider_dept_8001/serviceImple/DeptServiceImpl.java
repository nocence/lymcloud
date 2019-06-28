package com.gkts.provider_dept_8001.serviceImple;

import com.gkts.lymcloud.entities.Dept;
import com.gkts.provider_dept_8001.mapper.DeptMapper;
import com.gkts.provider_dept_8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept findById(Integer id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
