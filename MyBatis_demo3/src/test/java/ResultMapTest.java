import com.jac.mybatis.mapper.EmpMapper;
import com.jac.mybatis.pojo.Emp;
import com.jac.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: MyBatis
 * @description:
 * @author: Leslie
 * @create: 2023-10-31 16:25
 **/

public class ResultMapTest {

    @Test
    public void testSelectAllEmpOld() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        List<Emp> empList = mapper.selectAllEmpOld();
        empList.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void testSelectAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        List<Emp> empList = mapper.selectAllEmp();
        empList.forEach(emp -> System.out.println(emp));
    }
}
