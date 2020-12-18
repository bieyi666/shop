package com.shop.controller;

import com.github.pagehelper.PageHelper;
import com.shop.service.CommodityService;
import com.shop.vo.Commodity;
import com.shop.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//商品
@Controller
public class CommodityController {

    @Autowired
    CommodityService commodityService;

    /**
     * 根据条件查询所以商品信息
     *
     * @param commodity
     * @return
     */
    @CrossOrigin
    @RequestMapping("/queryAllCommodity.action")
    @ResponseBody
    public PageVo<Commodity> queryAllCommodity(Commodity commodity,
                                               @RequestParam(value = "page", defaultValue = "1") int page,
                                               @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return commodityService.queryAllCommodity(commodity, page, rows);
    }
}
