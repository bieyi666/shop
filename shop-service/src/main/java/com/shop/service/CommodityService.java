package com.shop.service;

import com.shop.vo.Commodity;
import com.shop.vo.PageVo;

import java.util.List;

//商品
public interface CommodityService {

    /**
     *根据条件查询所以商品信息
     * @param commodity
     * @return
     */
    public PageVo<Commodity> queryAllCommodity(Commodity commodity,int page,int rows);





}
