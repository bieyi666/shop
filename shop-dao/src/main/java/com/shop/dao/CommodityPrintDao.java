package com.shop.dao;

import com.shop.vo.CommodityPrint;

import java.util.List;

//商品图库
public interface CommodityPrintDao {
    /**
     * 根据条件查询所以图片
     * @param commodityPrint
     * @return
     */
    public List<CommodityPrint> queryAllCommodityPrint(CommodityPrint commodityPrint);
    /**
     * 根据条件查询所以图片数量
     * @param commodityPrint
     * @return
     */
    public int queryCountCommodityPrint(CommodityPrint commodityPrint);

    /**
     *
     * 添加图片
     * @param commodityPrint
     * @return
     */
    public int insertCommodityPrint(CommodityPrint commodityPrint);

    /**
     *删除图片
     * @param commodityPrint
     * @return
     */
    public int deleteCommodityPrint(CommodityPrint commodityPrint);
}
