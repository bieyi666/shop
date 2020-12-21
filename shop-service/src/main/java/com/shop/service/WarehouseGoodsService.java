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

    /**
     * 添加仓库商品
     * @param warehouseGoods
     * @return
     */
    public int addWarehouseGoods(WarehouseGoods warehouseGoods);


    /**
     * 条件查询
     * @param warehouseGoods
     * @return
     */
    public List<WarehouseGoods> queryWarehouseGoodsById(WarehouseGoods warehouseGoods);

}
