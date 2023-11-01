package com.jac.mybatis.mapper;

import com.jac.mybatis.pojo.Emp;

import java.util.List;

public interface EmpMapper  {


    List<Emp> selectAllEmp();

    /**
     *
     * @return
     */
    List<Emp> selectAllEmpOld();
}
