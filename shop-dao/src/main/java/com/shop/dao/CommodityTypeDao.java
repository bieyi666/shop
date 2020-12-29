package com.shop.dao;

import com.shop.vo.CommodityType;

import java.util.List;

//商品类型
public interface CommodityTypeDao {


    /**
     * 根据商品编号 查询商品类型
     * @param cId
     * @return
     */
    public CommodityType queryCommodityTypeByCid(int cId);



    //上面为供货商 ————————————————————————————————————————————————————————————————————————————————————————————


    /**
     * 查询所有商品类型
     * @return
     */
    public List<CommodityType> queryAllCommodityType(CommodityType commodityType);

    /**
     * 查询所有主类型
     * @return
     */
    public List<CommodityType> queryAllzhu();

    /**
     * 根据查询所有中类型
     * @return
     */
    public List<CommodityType> queryAllzho(int ter);

    /**
     * 根据查询所有次类型
     * @return
     */
    public List<CommodityType> queryAllci(int tsan);

    /**
     * 条件查询商品次类
     * @param ter
     * @return
     */
    public List<CommodityType>queryAllciq(int ter);

    /**
     * 查询所有指定商品id的次类型
     * @param tid
     * @return
     */
    public List<CommodityType>queryAllxiuzho(int tid);
    /**
     * 查询所有指定商品id的中类型
     * @param tid
     * @return
     */
    public List<CommodityType>queryAllxiuci(int tid);
}
