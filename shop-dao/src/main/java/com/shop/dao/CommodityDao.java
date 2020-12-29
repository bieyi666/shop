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
     * 根据商品编号 修改商品信息
     * @param commodity
     * @return
     */
    public int updateCommodityByPid(Commodity commodity);



    //上面为供货商代码  不可修改 可使用————————————————————————————————————————————————————————————————————


    /**
     *修改属性状态调整上下架
     * @param id 商品编号
     * @return
     */
    public int delCommodityById(int id);

    /**
     * 根据编号 查询商品
     * @param cid
     * @return
     */
    public Commodity queryCommodityById(int cid);

    /**
     * 添加商品
     * @param commodity
     * @return
     */
    public int insertCommodity(Commodity commodity);
    /**
     * 查询所以商品以及库存
     * @param commodity
     * @return
     */
    public List<Commodity>  queryAllCommodityer(Commodity commodity);

    /**
     * 模糊查询商品
     * @param commodity
     * @return
     */
    public List<Commodity> queryAllCommoditysan(Commodity commodity);

}
