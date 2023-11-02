import com.jac.mybatis.mapper.DeptMapper;
import com.jac.mybatis.mapper.EmpMapper;
import com.jac.mybatis.pojo.Dept;
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

    @Test
    public void testGetEmpAndDeptById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        Emp emp = mapper.getEmpAndDeptById(1);
        System.out.println(emp);
    }

    @Test
    public void testGetEmpAndDeptByIdStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        Emp emp = mapper.getEmpAndDeptByIdStepOne(1);
        System.out.println(emp.getEmpName());
        System.out.println("-------------------------------");
        System.out.println(emp.getDept().getDeptName());
    }

    @Test
    public void testGetDeptAndEmpById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);

        Dept dept = mapper.getDeptAndEmpById(1);
        System.out.println(dept);
        System.out.println("-------------------------------");
        dept.getEmpList().forEach(emp -> System.out.println(emp));
    }

    @Test
    public void testGetDeptAndEmpByIdStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);

        Dept dept = mapper.getDeptAndEmpByIdStepOne(1);
        System.out.println(dept.getDeptName());
        System.out.println("------------------------------------");
        dept.getEmpList().forEach(emp -> System.out.println(emp));
    }


}
