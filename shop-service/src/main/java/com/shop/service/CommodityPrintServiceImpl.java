package com.shop.service;

import com.shop.dao.CommodityPrintDao;
import com.shop.vo.CommodityPrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//商品图库
@Service
public class CommodityPrintServiceImpl implements CommodityPrintService

{

    @Autowired
    CommodityPrintDao commodityPrintDao;

    /**
     *
     * 添加图片
     * @param commodityPrint
     * @return
     */
    @Override
    public int insertCommodityPrint(CommodityPrint commodityPrint) {
        return commodityPrintDao.insertCommodityPrint(commodityPrint);
    }
    /**
     * 根据条件查询所以图片
     * @param commodityPrint
     * @return
     */
    @Override
    public List<CommodityPrint> queryAllCommodityPrint(CommodityPrint commodityPrint) {
        return commodityPrintDao.queryAllCommodityPrint(commodityPrint);
    }
}
