package com.shop.service;

import com.shop.vo.CommodityType;

import java.util.List;

//商品类型
public interface CommodityTypeService {

    /**
     * 查询所有商品类型
     * @return
     */
    public List<CommodityType> queryAllCommodityType(CommodityType commodityType);
    /**
     * 查询所有主类型
     * @return
     */
    public List<CommodityType> queryAllzhu();

    /**
     * 根据查询所有中类型
     * @return
     */
    public List<CommodityType> queryAllzho(int ter);

    /**
     * 根据查询所有次类型
     * @return
     */
    public List<CommodityType> queryAllci(int tsan);

    /**
     * 条件查询商品次类
     * @param ter
     * @return
     */
    public List<CommodityType>queryAllciq(int ter);

    /**
     * 查询所有指定商品id的次类型
     * @param tid
     * @return
     */
    public List<CommodityType>queryAllxiuzho(int tid);
    /**
     * 查询所有指定商品id的中类型
     * @param tid
     * @return
     */
    public List<CommodityType>queryAllxiuci(int tid);




    /**
     * 添加主类型
     * @param commodityType
     * @return
     */
    public int insertzhu(CommodityType commodityType);
    /**
     * 添加中类型
     * @param commodityType
     * @return
     */
    public int insertzho(CommodityType commodityType);
    /**
     * 添加次类型
     * @param commodityType
     * @return
     */
    public int insertci(CommodityType commodityType);

    /**
     * 修改主类型
     * @param commodityType
     * @return
     */
    public int updatezhu(CommodityType commodityType);
    /**
     * 修改中类型
     * @param commodityType
     * @return
     */
    public int updatezho(CommodityType commodityType);
    /**
     * 修改次类型
     * @param commodityType
     * @return
     */
    public int updateci(CommodityType commodityType);

    /**
     * 删除类型
     * @param tId
     * @return
     */
    public int deleteAll(int tId);

    /**
     * 查询指定所有类型
     * @param
     * @return
     */
    public List<CommodityType> getAllzhu();
    /**
     * 查询指定所有类型
     * @param
     * @return
     */
    public List<CommodityType> getAllzho();
}
