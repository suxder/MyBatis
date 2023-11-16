package com.jac.mybatis.mapper;

import com.jac.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 多条件查询：trim标签
     */
    List<Emp> getEmpByConditionThree(Emp emp);

    /**
     * 多条件查询：choose、when、otherwise标签
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 通过数据实现批量删除
     */
    int deleteBatchByArray(@Param("eids") Integer[] eids);

    /**
     * 通过list集合实现批量添加
     * @param emps
     * @return
     */
    int insertBatchByList(@Param("emps") List<Emp> emps);
}
