package com.shop.service;

import com.shop.dao.CommodityTypeDao;
import com.shop.vo.CommodityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//商品类型
@Service
public class CommodityTypeServiceImpl implements CommodityTypeService
{

    @Autowired
    CommodityTypeDao commodityTypeDao;

    /**
     * 查询所有商品类型
     * @return
     */
    @Override
    public List<CommodityType> queryAllCommodityType(CommodityType commodityType) {
        return commodityTypeDao.queryAllCommodityType(commodityType);
    }
    /**
     * 查询所有主类型
     * @return
     */
    @Override
    public List<CommodityType> queryAllzhu() {
        return commodityTypeDao.queryAllzhu();
    }
    /**
     * 查询所有中类型
     * @return
     */
    @Override
    public List<CommodityType> queryAllzho(int ter) {
        return commodityTypeDao.queryAllzho(ter);
    }
    /**
     * 查询所有次类型
     * @return
     */
    @Override
    public List<CommodityType> queryAllci(int tsan) {
        return commodityTypeDao.queryAllci(tsan);
    }
}
