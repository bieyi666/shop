package com.shop.service;

import com.shop.vo.Menu;
import com.shop.vo.MenuBtn;
import com.shop.vo.Role;

import java.util.List;

/**
 * @author "can"
 */
public interface MenuService {

    /**
     * 查询菜单 带权限
     * @param list
     * @return
     */
    public List<Menu> seMenu(List<Role> list);

    /**
     * 查询按钮 带权限
     * @param list
     * @return
     */
    public List<MenuBtn> seMenuBtn(List<Role> list);

    /**
     * 查询菜单1
     * @return
     */
    public List<Menu> seMenu1();
}
