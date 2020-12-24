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

import java.util.List;

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

    /**
     * 根据商品编号 修改商品信息
     * @param commodity
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/updateCommodityByPid.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public int updateCommodityByPid(Commodity commodity) {
        return commodityService.updateCommodityByPid(commodity);
    }

    //上面为供货商代码  不可修改 可使用————————————————————————————————————————————————————————————————————

    /**
     * 根据条件查询单条
     * @param cid
     * @return
     */
    @CrossOrigin
    @RequestMapping("/queryCommodityById.action")
    @ResponseBody
    public Commodity queryCommodityById(int cid){
        return  commodityService.queryCommodityById(cid);
    }

    /**
     * 模糊查询所有商品
     * @param commodity
     * @return
     */
    @CrossOrigin
    @RequestMapping("/queryAllCommoditysan.action")
    @ResponseBody
    public List<Commodity> queryAllCommoditysan(Commodity commodity){
        return  commodityService.queryAllCommoditysan(commodity);
    }
}
