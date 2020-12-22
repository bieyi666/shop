package com.shop.service;

import com.shop.vo.Role;

import java.util.List;

/**
 * @author "can"
 */
public interface RoleService {

    /**
     * 查询所有的角色
     * @return
     */
    public List<Role> seRole();

    /**
     * 添加角色
     * @param name
     * @return
     */
    public boolean inRole(String name);

    /**
     * 删除角色
     * @param id
     * @return
     */
    public boolean delRole(Integer id);

    /**
     * 修改员工
     * @param name
     * @param id
     * @return
     */
    public boolean upRole(String name, Integer id);
}
