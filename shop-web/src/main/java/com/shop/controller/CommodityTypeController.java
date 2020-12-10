package com.shop.controller;

import com.shop.service.CommodityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//商品类型
@Controller
public class CommodityTypeController {

    @Autowired
    CommodityTypeService commodityTypeService;

}
