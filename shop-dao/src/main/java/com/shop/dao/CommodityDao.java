package com.shop.dao;

import com.shop.vo.Commodity;

import java.util.List;

//商品
public interface CommodityDao {
    /**
     *根据条件查询所以商品信息
     * @param commodity
     * @return
     */
    public List<Commodity> queryAllCommodity(Commodity commodity);
    /**
     * 查询商品总数
     * @return
     */
    public int queryCountCommodity(Commodity commodity);


    /**
     *根据商品编号删除商品（修改状态）
     * @param id 商品编号
     * @return
     */
    public int delCommodityById(int id);

    /**
     * 添加商品信息
     * @param commodity
     * @return
     */
    public int insertCommodity(Commodity commodity);

    /**
     *根据id修改商品
     * @param commodity
     * @return
     */
    public int updateCommodityById(Commodity commodity);
}
