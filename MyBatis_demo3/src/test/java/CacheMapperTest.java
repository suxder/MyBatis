import com.jac.mybatis.mapper.CacheMapper;
import com.jac.mybatis.pojo.Emp;
import com.jac.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: MyBatis
 * @description: CacheMapper测试类
 * @author: Leslie
 * @create: 2023-11-20 16:23
 **/

public class CacheMapperTest {

    @Test
    public void testOneCache() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper cacheMapper = sqlSession.getMapper(CacheMapper.class);
        /**
         * sqlSession级Mysql一级缓存自动开启，同一sqlSession的同一语句只会在数据库中执行一次
         */
        Emp emp = cacheMapper.getEmpByEid(1);
        System.out.println(emp);
        /**
         * 失效情况1：在两次查询之间进行增删查改操作
         */
        cacheMapper.insertEmp(new Emp(null, "马克", 23, "男", "3232@gamil.com"));
        Emp emp1 = cacheMapper.getEmpByEid(1);
        System.out.println(emp1);
        /**
         * 失效情况2：手动清除 sqlSession级缓存
         */
        sqlSession.clearCache();
        Emp emp2 = cacheMapper.getEmpByEid(1);
        System.out.println(emp2);
    }

    @Test
    public void testTwoCache() {
        try {
            InputStream is =  Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

            SqlSession sqlSession1 =  sqlSessionFactory.openSession(true);
            CacheMapper cacheMapper1 = sqlSession1.getMapper(CacheMapper.class);
            System.out.println(cacheMapper1.getEmpByEid(1));
            sqlSession1.close();

            /**
             * 两次缓存之间执行了任意的增删改，会使一级和二级缓存同时失效
             */

            SqlSession sqlSession2 =  sqlSessionFactory.openSession(true);
            CacheMapper cacheMapper2 = sqlSession2.getMapper(CacheMapper.class);
            System.out.println(cacheMapper2.getEmpByEid(1));
            sqlSession2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
