package com.jac.mybatis.mapper;

import com.jac.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper  {


    /**
     * 通过resultMap实现字段映射
     * @return
     */
    List<Emp> selectAllEmp();

    /**
     * 通过mybatis全局配置实现字段映射
     * @return
     */
    List<Emp> selectAllEmpOld();

    /**
     * 通过eid查询员工信息及员工部门信息
     */
    Emp getEmpAndDeptById(@Param("eid") Integer eid);

    /**
     * 分步查询，获得员工及员工所在部门信息
     * 第一步：查询员工信息
     * @param eid
     * @return
     */
    Emp getEmpAndDeptByIdStepOne(@Param("eid") Integer eid);

    /**
     * 通过分步查询，获取部门及部门中所有的员工信息
     * 第二步：查询部门中的员工列表
     * @param did
     * @return
     */
    List<Emp> getDeptAndEmpByIdStepTwo(@Param("did") Integer did);
}
