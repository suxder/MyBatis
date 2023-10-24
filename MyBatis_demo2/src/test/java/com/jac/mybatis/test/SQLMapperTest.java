package com.jac.mybatis.test;

import com.jac.mybatis.Utils.SqlSessionUtils;
import com.jac.mybatis.mapper.SQLMapper;
import com.jac.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: MyBatis
 * @description:
 * @author: Leslie
 * @create: 2023-10-10 14:52
 **/

public class SQLMapperTest {

    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> list = mapper.getUserByLike("a");

        System.out.println(list);
    }

    @Test
    public void testDeleteBatch() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        int res = mapper.deleteBatch("1,2,3");

        System.out.println("删除条数：" + res);
    }
}
