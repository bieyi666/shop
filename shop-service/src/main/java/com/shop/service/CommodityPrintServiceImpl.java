package com.shop.service;

import com.shop.dao.CommodityPrintDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//商品图库
@Service
public class CommodityPrintServiceImpl implements CommodityPrintService
{

    @Autowired
    CommodityPrintDao commodityPrintDao;

}
