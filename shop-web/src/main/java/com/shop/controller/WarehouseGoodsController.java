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
@CrossOrigin
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
    public PageVo<WarehouseGoods> queryWarehouseGoodsByGroup(
                                                             @RequestParam(value = "page", defaultValue = "1") int page,
                                                             @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return warehouseGoodsService.queryWarehouseGoodsByGroup(page,rows);
    }

    /**
     * 添加仓库商品
     * @param warehouseGoods
     * @return
     */
    @RequestMapping("/addWarehouseGoods.action")
    @ResponseBody
    public String addWarehouseGoods(WarehouseGoods warehouseGoods) {
        int num=warehouseGoodsService.addWarehouseGoods(warehouseGoods);
        if (num>0){
            return "采购成功";
        }
        return "采购失败";
    }

    /**
     * 条件查询
     * @param warehouseGoods
     * @return
     */
    @RequestMapping(value = "/queryWarehouseGoodsById.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public List<WarehouseGoods> queryWarehouseGoodsById(WarehouseGoods warehouseGoods) {
        System.out.println("测试:"+warehouseGoodsService.queryWarehouseGoodsById(warehouseGoods));
        return warehouseGoodsService.queryWarehouseGoodsById(warehouseGoods);
    }

}
