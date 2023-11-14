import com.jac.mybatis.mapper.DynamicSQLMapper;
import com.jac.mybatis.mapper.EmpMapper;
import com.jac.mybatis.pojo.Emp;
import com.jac.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: MyBatis
 * @description: 动态SQL测试类
 * @author: Leslie
 * @create: 2023-11-02 17:14
 **/

public class DynamicSQLMapperTest {

    /**
     * 动态SQL：
     * 1、test标签：根据test属性中的表达式来决定标签中的内容是否需要拼接
     * 2、where标签：
     *      若where标签中有内容，则where标签会自动去掉内容前多余的and or等关键字
     *      若where标签中无内容，则where标签不会生效
     *      ！！！ 无法去掉内容后的and or 关键字
     */

    @Test
    public void testGetEmpByConditionOne() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        List<Emp> empList = mapper.getEmpByConditionOne(new Emp(null, "张怡然", 24, "", ""));
        empList.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void testGetEmpByConditionTwo() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        List<Emp> empList = mapper.getEmpByConditionTwo(new Emp(null, "", 24, "", ""));
        empList.forEach(emp -> System.out.println(emp));
    }
}
