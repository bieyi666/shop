package com.shop.service;

import com.shop.dao.CommodityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//商品
@Service
public class CommodityServiceImpl implements CommodityService
{

    @Autowired
    CommodityDao commodityDao;

}
