package com.shop.dao;

import com.shop.vo.Menu;

import java.util.List;

/**
 * @author "can"
 */
public interface MenuDao {

    /**
     * 查询菜单
     * @return
     */
    public List<Menu> seMenu();
}
