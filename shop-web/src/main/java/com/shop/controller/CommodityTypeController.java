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
    /**
     * 查询所有主类型
     * @return
     */
    @CrossOrigin
    @RequestMapping("/queryAllzhu.action")
    @ResponseBody
    public List<CommodityType> queryAllzhu( ) {
        return commodityTypeService.queryAllzhu();
    }
    /**
     * 根据查询所有中类型
     * @return
     */
    @CrossOrigin
    @RequestMapping("/queryAllzho.action")
    @ResponseBody
    public List<CommodityType> queryAllzho(int ter) {
        System.out.println("中的"+ter);
        return commodityTypeService.queryAllzho(ter);
    }
    /**
     * 根据查询所有次类型
     * @return
     */
    @CrossOrigin
    @RequestMapping("/queryAllci.action")
    @ResponseBody
    public List<CommodityType> queryAllci(int tsan) {
        System.out.println("次的"+tsan);
        return commodityTypeService.queryAllci(tsan);
    }
}
