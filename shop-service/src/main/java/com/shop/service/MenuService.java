package com.shop.service;

import com.shop.vo.Menu;

import java.util.List;

/**
 * @author "can"
 */
public interface MenuService {

    /**
     * 查询菜单
     * @return
     */
    public List<Menu> seMenu();
}