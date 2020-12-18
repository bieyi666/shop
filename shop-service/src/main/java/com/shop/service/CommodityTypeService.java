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

}
