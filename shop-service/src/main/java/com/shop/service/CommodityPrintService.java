package com.shop.service;

import com.shop.vo.CommodityPrint;

//商品图库
public interface CommodityPrintService {

    /**
     *
     * 添加图片
     * @param commodityPrint
     * @return
     */
    public int insertCommodityPrint(CommodityPrint commodityPrint);


}
