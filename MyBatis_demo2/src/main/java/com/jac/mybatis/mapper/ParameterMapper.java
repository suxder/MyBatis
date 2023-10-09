package com.jac.mybatis.mapper;

import com.jac.mybatis.pojo.User;

import java.util.List;

public interface ParameterMapper {

    /**
     * 获取所有用户信息
     */
    List<User> getAllUser();
}
