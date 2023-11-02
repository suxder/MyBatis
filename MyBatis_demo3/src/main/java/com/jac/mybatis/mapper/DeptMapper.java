package com.jac.mybatis.mapper;

import com.jac.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    /**
     * 获得员工及所在部门信息，分步查询实现
     * 第二步：根据部门id获取部门信息
     * @param did
     * @return
     */
    Dept getEmpAndDeptByIdStepTwo(@Param("did") Integer did);

    /**
     * 获取部门及部门中所有的员工信息
     * @param did
     * @return
     */
    Dept getDeptAndEmpById(@Param("did") Integer did);

    /**
     * 通过分步查询，获取部门及部门中所有的员工信息
     * 第一步：查询部门信息
     * @param did
     * @return
     */
    Dept getDeptAndEmpByIdStepOne(@Param("did") Integer did);
}
