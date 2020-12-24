package com.shop.dao;

import com.shop.vo.Menu;
import com.shop.vo.MenuBtn;
import com.shop.vo.Role;

import java.util.List;

/**
 * @author "can"
 */
public interface MenuDao {

    /**
     * 查询菜单 带权限
     * @param list
     * @return
     */
    public List<Menu> seMenu(List<Integer> list);

    /**
     * 查询按钮 带权限
     * @param list
     * @return
     */
    public List<MenuBtn> seMenuBtn(List<Integer> list);

    /**
     * 查询菜单1 授权用
     * @return
     */
    public List<Menu> seMenu1();
}
