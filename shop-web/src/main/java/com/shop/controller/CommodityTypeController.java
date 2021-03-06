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
    /**
     * 条件查询商品次类
     * @return
     */
    @CrossOrigin
    @RequestMapping("/queryAllciq.action")
    @ResponseBody
    public List<CommodityType> queryAllciq(int ter) {
        System.out.println("次展示的"+ter);
        return commodityTypeService.queryAllciq(ter);
    }
    /**
     * 修改条件查询商品次类
     * @return
     */
    @CrossOrigin
    @RequestMapping("/queryAllxiuci.action")
    @ResponseBody
    public List<CommodityType> queryAllxiuci(int tid) {
        return commodityTypeService.queryAllxiuci(tid);
    }
    /**
     * 修改条件查询商品中类
     * @return
     */
    @CrossOrigin
    @RequestMapping("/queryAllxiuzho.action")
    @ResponseBody
    public List<CommodityType> queryAllxiuzho(int tid) {
        return commodityTypeService.queryAllxiuzho(tid);
    }

    @CrossOrigin
    @RequestMapping("/insertzhu.action")
    @ResponseBody
    public int insertzhu(CommodityType commodityType) {

        return commodityTypeService.insertzhu(commodityType);
    }
    @CrossOrigin
    @RequestMapping("/insertzho.action")
    @ResponseBody
    public int insertzho(CommodityType commodityType) {
        return commodityTypeService.insertzho(commodityType);
    }
    @CrossOrigin
    @RequestMapping("/insertci.action")
    @ResponseBody
    public int insertci(CommodityType commodityType) {
        return commodityTypeService.insertci(commodityType);
    }
    @CrossOrigin
    @RequestMapping("/updatezhu.action")
    @ResponseBody
    public int updatezhu(CommodityType commodityType) {
        return commodityTypeService.updatezhu(commodityType);
    }
    @CrossOrigin
    @RequestMapping("/updatezho.action")
    @ResponseBody
    public int updatezho(CommodityType commodityType) {
        return commodityTypeService.updatezho(commodityType);
    }
    @CrossOrigin
    @RequestMapping("/updateci.action")
    @ResponseBody
    public int updateci(CommodityType commodityType) {
        return commodityTypeService.updateci(commodityType);
    }
    @CrossOrigin
    @RequestMapping("/deleteAll.action")
    @ResponseBody
    public int deleteAll(int  tId) {
        return commodityTypeService.deleteAll(tId);
    }
    @CrossOrigin
    @RequestMapping("/getAllzhu.action")
    @ResponseBody
    public List<CommodityType> getAllzhu( ) {
        return commodityTypeService.getAllzhu();
    }
    @CrossOrigin
    @RequestMapping("/getAllzho.action")
    @ResponseBody
    public  List<CommodityType> getAllzho(  ) {
        return commodityTypeService.getAllzho();
    }
}
