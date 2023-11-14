package com.jac.mybatis.mapper;

import com.jac.mybatis.pojo.Emp;

import java.util.List;

public interface DynamicSQLMapper {

    /**
     * 多条件查询：test标签
     */
    List<Emp> getEmpByConditionOne(Emp emp);

    /**
     * 多条件查询：where标签
     */
    List<Emp> getEmpByConditionTwo(Emp emp);
}
