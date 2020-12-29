package com.shop.controller;

import com.shop.service.CommodityPrintService;
import com.shop.utils.ImageUpload;
import com.shop.vo.CommodityPrint;
import com.shop.vo.CommodityType;
import org.apache.commons.collections.map.LinkedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


//商品图库
@CrossOrigin
@Controller
public class CommodityPrintController {

    @Autowired
    CommodityPrintService commodityPrintService;

    /**
     *
     * 添加图片
     * @param commodityPrint
     * @return
     */
    @CrossOrigin
    @RequestMapping("/insertCommodityPrint.action")
    @ResponseBody
    public String insertCommodityPrint(CommodityPrint commodityPrint, MultipartFile file) {
        ImageUpload imageUpload=new ImageUpload();
        String name=imageUpload.save_image(file);
        System.out.println(name);
        /*if (commodityPrint != null){
            commodityPrintService.insertCommodityPrint(commodityPrint);
        }*/
        return name;
    }
    /**
     *
     * 添加图片
     * @param commodityPrint
     * @return
     */
    @CrossOrigin
    @RequestMapping("/insertCommodityPrint2.action")
    @ResponseBody
    public int insertCommodityPrint2(CommodityPrint commodityPrint) {
        int num=commodityPrintService.queryCountCommodityPrint(commodityPrint);
        int in;
        if(num!=3){
            in= commodityPrintService.insertCommodityPrint(commodityPrint);
        }else {
            in=0;
        }
        return in;
    }
    //展示图片
    @CrossOrigin
    @RequestMapping("/queryAllCommodityPrint.action")
    @ResponseBody
    public List<CommodityPrint> queryAllCommodityPrint(CommodityPrint commodityPrint) {
        System.out.println(commodityPrint);
        return commodityPrintService.queryAllCommodityPrint(commodityPrint);
    }
    //展示图片
    @CrossOrigin
    @RequestMapping("/queryCountCommodityPrint.action")
    @ResponseBody
    public Map queryCountCommodityPrint(CommodityPrint commodityPrint) {
        System.out.println(commodityPrint);
        int num=commodityPrintService.queryCountCommodityPrint(commodityPrint);
        Map map=new LinkedMap();
        map.put("num",num);
        if(num!=3){
            map.put("num1",num);
        }else {
            map.put("num2",num);
        }
        return map;
    }
}
