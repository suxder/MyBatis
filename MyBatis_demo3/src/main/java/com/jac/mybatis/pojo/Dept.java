package com.jac.mybatis.pojo;

import java.util.List;

/**
 * @program: MyBatis
 * @description: 部门实体类
 * @author: Leslie
 * @create: 2023-10-31 15:30
 **/

public class Dept {

    private Integer did;

    private String deptName;

    private List<Emp> empList;

    public Dept() {
    }

    public Dept(Integer did, String deptName, List<Emp> empList) {
        this.did = did;
        this.deptName = deptName;
        this.empList = empList;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", deptName='" + deptName + '\'' +
                ", empList=" + empList +
                '}';
    }
}
