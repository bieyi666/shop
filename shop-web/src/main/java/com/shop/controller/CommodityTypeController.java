package com.shop.controller;

import com.shop.service.CommodityTypeService;
import com.shop.vo.CommodityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//商品类型
@Controller
public class CommodityTypeController {

    @Autowired
    CommodityTypeService commodityTypeService;

    /**
     * 查询所有商品类型 (供应商类型查询 不能动)
     * @return
     */
    @CrossOrigin
    @RequestMapping("/queryAllCommodityType.action")
    @ResponseBody
    public List<CommodityType> queryAllCommodityType(CommodityType commodityType) {
        return commodityTypeService.queryAllCommodityType(commodityType);
    }

}
