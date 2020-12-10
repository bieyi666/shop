package com.shop.service;

import com.shop.dao.CommodityTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//商品类型
@Service
public class CommodityTypeServiceImpl implements CommodityTypeService
{

    @Autowired
    CommodityTypeDao commodityTypeDao;

}
