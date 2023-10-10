package com.jac.mybatis.mapper;

import com.jac.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface SelectMapper {

    /**
     * 根据ID查询用户信息
     */
    User getUserById(@Param("id") Integer id);
}
