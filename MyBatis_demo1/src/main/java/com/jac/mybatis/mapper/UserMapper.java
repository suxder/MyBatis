package com.jac.mybatis.mapper;

import com.jac.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    /*
     *  MyBatis面向接口编程的两个一致：
     *  1、映射文件namespace和Mapper接口的全类名一致
     *  2、映射文件中sql语句的id和mapper接口中的方法一致
     */

    /**
     * 添加用户信息
     * @return int
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据ID查询用户信息
     */
    User getUserById();

    /**
     * 查询所有用户信息
     */
    List<User> getAllUser();
}
