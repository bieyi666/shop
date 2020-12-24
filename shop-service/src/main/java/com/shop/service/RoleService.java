package com.shop.service;

import com.shop.vo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author "can"
 */
public interface RoleService {

    /**
     * 查询所有的角色
     *
     * @return
     */
    public List<Role> seRole();

    /**
     * 添加角色
     *
     * @param name
     * @return
     */
    public boolean inRole(String name);

    /**
     * 删除角色
     *
     * @param id
     * @return
     */
    public boolean delRole(Integer id);

    /**
     * 修改员工
     *
     * @param name
     * @param id
     * @return
     */
    public boolean upRole(String name, Integer id);

    /**
     * 查询角色权限
     *
     * @param id 角色id
     * @return 菜单按钮id集合
     */
    public List<Integer> seRolePer(Integer id);

    /**
     * 添加角色权限
     * @param rid
     * @param midList1 选中id
     * @param midList2 半选中id
     * @return
     */
    public boolean inRolePer(Integer rid, String midList1, String midList2);

    /**
     * 删除角色权限
     *
     * @param rid 角色id
     * @param mid 菜单按钮id
     * @return
     */
    public boolean delRolePer(Integer rid);
}
