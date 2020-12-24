package com.shop.dao;

import com.shop.vo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author "can"
 */
public interface RoleDao {

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
    public int inRole(String name);

    /**
     * 删除角色
     *
     * @param id
     * @return
     */
    public int delRole(Integer id);

    /**
     * 修改员工
     *
     * @param name
     * @param id
     * @return
     */
    public int upRole(@Param("name") String name, @Param("id") Integer id);

    /**
     * 查询角色权限
     *
     * @param id 角色id
     * @return 菜单按钮id集合
     */
    public List<Integer> seRolePer(Integer id);

    /**
     * 添加角色权限
     *
     * @param rid 角色id
     * @param mid 菜单按钮id
     * @return
     */
    public int inRolePer(@Param("rid") Integer rid, @Param("mid") Integer mid);

    /**
     * 删除角色权限
     *
     * @param rid 角色id
     * @return
     */
    public int delRolePer(Integer rid);

}
