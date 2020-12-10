package com.shop.controller;

import com.shop.service.CommodityPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//商品图库
@Controller
public class CommodityPrintController {

    @Autowired
    CommodityPrintService commodityPrintService;

}
