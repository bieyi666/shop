package com.shop.dao;

import com.shop.vo.ShoppingCat;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author "can"
 */
public interface ShoppingCatDao {

    /**
     * 根据用户查询购物车表
     * @param uid
     * @return
     */
    public List<ShoppingCat> seShoppingCat(Integer uid);

    /**
     * 删除购物车一条数据
     * @param id
     * @return
     */
    public int delShoppingCat(Integer id);

    /**
     * 批量删除购物车数据
     * @param list
     * @return
     */
    public int delShoppingCatBat(List<Integer> list);

    /**
     * 加入购物车
     * @param map
     * @return
     */
    public int inShoppingCat(Map<String, Object> map);

    /**
     * 修改购物车商品数量
     * @param map
     * @return
     */
    public int upShoppingCatGoodsNum(Map<String, Object> map);

}
