package com.gkts.provider_dept_8002.mapper;

import com.gkts.lymcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface DeptMapper {

    Dept findById(Integer id);

    List<Dept> findAll();
}
