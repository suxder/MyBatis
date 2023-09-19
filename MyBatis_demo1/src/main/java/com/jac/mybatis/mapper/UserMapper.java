package com.jac.mybatis.mapper;

public interface UserMapper {

    /*
     *  MyBatis面向接口编程的两个一致：
     *  1、映射文件namespace和Mapper接口的全类名一致
     *  2、映射文件中sql语句的id和mapper接口中的方法一致
     */

    /**
     * 添加用户信息
     * sql写在映射文件中
     * @return int
     */
    int insertUser();
}
