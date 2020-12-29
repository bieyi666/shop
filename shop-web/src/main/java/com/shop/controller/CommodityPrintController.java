package com.shop.controller;

import com.shop.service.CommodityPrintService;
import com.shop.utils.ImageUpload;
import com.shop.vo.CommodityPrint;
import com.shop.vo.CommodityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


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

    @CrossOrigin
    @RequestMapping("/queryAllCommodityPrint.action")
    @ResponseBody
    public List<CommodityPrint> queryAllCommodityPrint(CommodityPrint commodityPrint) {
        return commodityPrintService.queryAllCommodityPrint(commodityPrint);
    }
}
