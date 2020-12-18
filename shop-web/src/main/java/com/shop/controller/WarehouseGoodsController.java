package com.shop.controller;

import com.github.pagehelper.PageHelper;
import com.shop.service.WarehouseGoodsService;
import com.shop.vo.PageVo;
import com.shop.vo.WarehouseGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//仓库商品
@Controller
public class WarehouseGoodsController {

    @Autowired
    WarehouseGoodsService warehouseGoodsService;

    /**
     * 查询所有仓库商品
     *
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/queryAllWarehouseGoods.action")
    @ResponseBody
    public List<WarehouseGoods> queryAllWarehouseGoods(int id) {
        return warehouseGoodsService.queryAllWarehouseGoods(id);
    }

    /**
     *分组查询
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/queryWarehouseGoodsByGroup.action")
    @ResponseBody
    public PageVo<WarehouseGoods> queryWarehouseGoodsByGroup(@RequestParam(value = "page", defaultValue = "1") int page,
                                                             @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return warehouseGoodsService.queryWarehouseGoodsByGroup(page,rows);
    }

}
