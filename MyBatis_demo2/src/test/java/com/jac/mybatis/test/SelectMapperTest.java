package com.jac.mybatis.test;

import com.jac.mybatis.Utils.SqlSessionUtils;
import com.jac.mybatis.mapper.SelectMapper;
import com.jac.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @program: MyBatis
 * @description:
 * @author: Leslie
 * @create: 2023-10-10 11:04
 **/

public class SelectMapperTest {

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(3);

        System.out.println(user);
    }

    @Test
    public void testGetUserCount() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer userCount = mapper.getUserCount();

        System.out.println(userCount);

    }

    @Test
    public void testGetUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserByIdToMap(3);

        System.out.println(map);
    }

    @Test
    public void testGetAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getAllUserToMap();

        System.out.println(map);
    }
}
