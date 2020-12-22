package com.shop.dao;

import com.shop.vo.WarehouseGoods;

import java.util.List;

//仓库商品
public interface WarehouseGoodsDao {

    /**
     * 查询所有仓库商品
     * @return
     */
    public List<WarehouseGoods> queryAllWarehouseGoods(int id);

    /**
     * 查询仓库商品总数量
     * @return
     */
    public int queryCountWarehouseGoods();

    /**
     *分组查询
     * @return
     */
    public List<WarehouseGoods> queryWarehouseGoodsByGroup();

    /**
     * 分组总条数
     * @return
     */
    public int queryCountWarehouseGoodsByGroup();

    /**
     * 根据商品编号 查询商品库存
     * @param cid
     * @return
     */
    public WarehouseGoods queryWarehouseGoodsByCid(int cid);
}
