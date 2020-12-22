package com.shop.dao;

import com.shop.vo.CommodityType;

import java.util.List;

//商品类型
public interface CommodityTypeDao {


    /**
     * 根据商品编号 查询商品类型
     * @param cid
     * @return
     */
    public CommodityType queryCommodityTypeByCid(int cid);



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

}
