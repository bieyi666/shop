package com.shop.dao;

import com.shop.vo.Role;

import java.util.List;

/**
 * @author "can"
 */
public interface RoleDao {

    /**
     * 查询所有的角色
     * @return
     */
    public List<Role> seRole();
}
