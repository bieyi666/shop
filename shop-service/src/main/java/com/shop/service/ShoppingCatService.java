package com.shop.service;

import com.shop.vo.ShoppingCat;

import java.util.List;
import java.util.Map;

/**
 * @author "can"
 */
public interface ShoppingCatService {

    /**
     * 根据用户查询购物车表
     * @param uid
     * @return
     */
    public List<List<Map>> seShoppingCat(Integer uid);

    /**
     * 删除购物车一条数据
     * @param id
     * @return
     */
    public boolean delShoppingCat(Integer id);

    /**
     * 批量删除购物车数据
     * @param list
     * @return
     */
    public boolean delShoppingCatBat(List<Integer> list);
}
