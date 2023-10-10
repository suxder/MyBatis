package com.jac.mybatis.mapper;

import com.jac.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    /**
     * 根据ID查询用户信息
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询用户信息的总记录数
     */
    Integer getUserCount();

    /**
     * 根据ID查询用户信息为一个map集合
     */
    @MapKey("id")
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有用户信息为一个map集合
     */
    @MapKey("id")
   Map<String, Object> getAllUserToMap();
}
