package com.shop.service;

import com.shop.vo.Emp;
import com.shop.vo.PageVo;

import java.util.Map;

/**
 * @author "can"
 */
public interface EmpService {
    /**
     * 查询员工，条件
     * @param conditions
     * @param rows
     * @param page
     * @return
     */
    public PageVo<Emp> seEmp(String conditions, int rows, int page);

    /**
     * 修改员工信息
     * @param id
     * @param name
     * @param sex
     * @param age
     * @param phone
     * @param address
     * @param img
     * @return
     */
    public boolean upEmp(Integer id, String name, String sex, Integer age, String phone, String address, String img);

    /**
     * 添加员工信息
     * @param name
     * @param sex
     * @param age
     * @param phone
     * @param address
     * @param img
     * @return
     */
    public boolean inEmp(String name, String sex, Integer age, String phone, String address, String img);

    /**
     * 删除员工信息（逻辑删除）
     * @param id
     * @return
     */
    public boolean delEmp(Integer id);

    /**
     * 添加员工角色信息
     * @param eid 员工id
     * @param rid 角色id
     * @return
     */
    public boolean inEmpRole(Integer eid, Integer rid);

    /**
     * 添加员工角色信息
     * @param eid 员工id
     * @param rid 角色id
     * @return
     */
    public boolean delEmpRole(Integer eid, Integer rid);
}
