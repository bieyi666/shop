package com.shop.controller;

import com.shop.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//商品
@Controller
public class CommodityController {

    @Autowired
    CommodityService commodityService;
}
