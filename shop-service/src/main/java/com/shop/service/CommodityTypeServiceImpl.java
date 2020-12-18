package com.shop.service;

import com.shop.dao.CommodityTypeDao;
import com.shop.vo.CommodityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//商品类型
@Service
public class CommodityTypeServiceImpl implements CommodityTypeService
{

    @Autowired
    CommodityTypeDao commodityTypeDao;

    /**
     * 查询所有商品类型
     * @return
     */
    @Override
    public List<CommodityType> queryAllCommodityType(CommodityType commodityType) {
        return commodityTypeDao.queryAllCommodityType(commodityType);
    }
}
