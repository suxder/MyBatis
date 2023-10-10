package com.jac.mybatis.mapper;

import com.jac.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {

    /**
     * 获取所有用户信息
     */
    List<User> getAllUser();

    User getUserByUsername(String username);

    /**
     * 验证登录
     */
    User checkLogin(String username, String password);

    /**
     * 验证登录By Map
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 验证登录By Param注解
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

    /**
     * 新增用户
     */
    int insertUser(User user);
}
