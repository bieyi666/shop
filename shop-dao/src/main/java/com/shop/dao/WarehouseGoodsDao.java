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
     * 添加仓库商品
     * @param warehouseGoods
     * @return
     */
    public int addWarehouseGoods(WarehouseGoods warehouseGoods);

    /**
     * 修改库存
     * @param warehouseGoods
     * @return
     */
    public int updateWarehouseGoods(WarehouseGoods warehouseGoods);

    /**
     * 条件查询
     * @param warehouseGoods
     * @return
     */
    public List<WarehouseGoods> queryWarehouseGoodsById(WarehouseGoods warehouseGoods);

    /**
     * 条件查询
     * @param warehouseGoods
     * @return
     */
    public List<WarehouseGoods> queryWarehouseGoodsByIds(WarehouseGoods warehouseGoods);

    /**
     * 分布查库存
     * @param cid
     * @return
     */
    public WarehouseGoods queryWarehouseGoodsByCid(int cid);
}
