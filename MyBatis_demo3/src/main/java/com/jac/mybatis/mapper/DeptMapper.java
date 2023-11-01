package com.jac.mybatis.mapper;

import com.jac.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    Dept getEmpAndDeptByIdStepTwo(@Param("did") Integer did);
}
