package com.shop.service;

import com.shop.vo.PageVo;
import com.shop.vo.WarehouseGoods;

import java.util.List;

//仓库商品
public interface WarehouseGoodsService {

    /**
     * 查询所有仓库商品
     * @return
     */
    public List<WarehouseGoods> queryAllWarehouseGoods(int id);

    /**
     *分组查询
     * @return
     */
    public PageVo<WarehouseGoods> queryWarehouseGoodsByGroup(int page,int rows);
}
