package com.shop.service;

import com.shop.vo.CommodityType;

import java.util.List;

//商品类型
public interface CommodityTypeService {

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
}
