package com.atguigu.mybatis.test;

import com.jac.mybatis.mapper.UserMapper;
import com.jac.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: MyBatis
 * @description: MyBatisTest测试类
 * @author: Leslie
 * @create: 2023-09-19 19:27
 **/

public class MyBatisTest {

    @Test
    public void testMyBatis() throws IOException {
        // 加载核心配置文件
        InputStream is =  Resources.getResourceAsStream("mybatis-config.xml");
        //获取sqlsessionfactorybuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取factory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class); //代理模式

        //测试功能
        int result = mapper.insertUser();

        System.out.println("result:"+result);
    }

    @Test
    public void testCRUD() throws IOException {
        InputStream is =  Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User>  list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }




}
