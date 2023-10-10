package com.jac.mybatis.test;

import com.jac.mybatis.Utils.SqlSessionUtils;
import com.jac.mybatis.mapper.ParameterMapper;
import com.jac.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: MyBatis
 * @description:
 * @author: Leslie
 * @create: 2023-10-09 14:36
 **/

public class ParameterMapperTest {

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }

    @Test
    public void testGetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByUsername("宫若梅");
        System.out.println(user);
    }

    @Test
    public void testCheckLogin() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLogin("宫若梅", "456");
        System.out.println(user);
    }

    @Test
    public void testCheckLoginByMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("username", "宫若梅");
        map.put("password", "456");

        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void testCheckLoginByParam() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLoginByParam("张怡然", "20001006@ZWYzwy");
        System.out.println(user);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        mapper.insertUser(new User(null, "叶问", "456", 23, "m", "1439433131@qq.com"));
    }

    @Test
    public void testJDBC() throws Exception {
        String username = "宫若梅";

        Class.forName("");
        Connection connection = DriverManager.getConnection("", "", "");
        // connection.prepareStatement("select * from t_user where username = '" + username + "'");
        PreparedStatement ps =  connection.prepareStatement("select * from t_user where username = ?");
        ps.setString(1, username);
    }
}
