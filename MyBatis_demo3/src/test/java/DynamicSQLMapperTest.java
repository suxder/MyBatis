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

    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        List<Emp> empList = mapper.getEmpByCondition(new Emp(null, "张文怡", 24, "", ""));
        empList.forEach(emp -> System.out.println(emp));
    }
}
