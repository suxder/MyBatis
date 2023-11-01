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

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteBatch(@Param("ids") String ids);

    /**
     * 查询指定表中的数据
     * @param tableName
     * @return
     */
    List<User> getUserByTableName(@Param("tableName") String tableName);

    /**
     * insert UserInfo
     * @param user
     */
    void insertUser(User user);


}
