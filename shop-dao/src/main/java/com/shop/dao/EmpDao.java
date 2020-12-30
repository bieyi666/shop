package com.shop.dao;

import com.shop.vo.Emp;

import java.util.List;
import java.util.Map;

/**
 * @author "can"
 */
public interface EmpDao {

    /**
     * 查询员工，条件
     * @param map
     * @return
     */
    public List<Emp> seEmp(Map<String, Object> map);

    /**
     * 查询员工，id
     * @param id
     * @return
     */
    public Emp seEmp1(Integer id);

    /**
     * 查询员工总条数
     * @param map
     * @return
     */
    public int seEmpCount(Map<String, Object> map);

    /**
     * 修改员工信息
     * @param map
     * @return
     */
    public int upEmp(Map<String, Object> map);


    /**
     * 修改员工信息
     * @param map
     * @return
     */
    public int inEmp(Emp map);

    /**
     * 删除员工信息（逻辑删除）
     * @param id
     * @return
     */
    public int delEmp(Integer id);

    /**
     * 添加员工角色信息
     * @param map
     * @return
     */
    public int inEmpRole(Map<String, Object> map);

    /**
     * 删除员工角色信息
     * @param map
     * @return
     */
    public int delEmpRole(Map<String, Object> map);
}
