package com.jac.mybatis.mapper;

import com.jac.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {

    /**
     * 根据username模糊查询
     * @param username
     * @return List<User>
     */
    List<User> getUserByLike(@Param("username") String username);


    int deleteBatch(@Param("ids") String ids);
}
