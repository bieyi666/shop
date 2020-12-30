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

    /**
     * 条件查询商品次类
     * @param ter
     * @return
     */
    @Override
    public List<CommodityType> queryAllciq(int ter) {
        return commodityTypeDao.queryAllciq(ter);
    }
    /**
     * 查询所有指定商品id的次类型
     * @param tid
     * @return
     */
    @Override
    public List<CommodityType> queryAllxiuzho(int tid) {
        return commodityTypeDao.queryAllxiuzho(tid);
    }
    /**
     * 查询所有指定商品id的中类型
     * @param tid
     * @return
     */
    @Override
    public List<CommodityType> queryAllxiuci(int tid) {
        return commodityTypeDao.queryAllxiuci(tid);
    }

    @Override
    public int insertzhu(CommodityType commodityType) {
        return commodityTypeDao.insertzhu(commodityType);
    }

    @Override
    public int insertzho(CommodityType commodityType) {
        return commodityTypeDao.insertzho(commodityType);
    }

    @Override
    public int insertci(CommodityType commodityType) {
        return commodityTypeDao.insertci(commodityType);
    }

    @Override
    public int updatezhu(CommodityType commodityType) {
        return commodityTypeDao.updatezhu(commodityType);
    }

    @Override
    public int updatezho(CommodityType commodityType) {
        return commodityTypeDao.updatezho(commodityType);
    }

    @Override
    public int updateci(CommodityType commodityType) {
        return commodityTypeDao.updateci(commodityType);
    }

    @Override
    public int deleteAll(int tId) {
        return commodityTypeDao.deleteAll(tId);
    }

    @Override
    public List<CommodityType> getAllzhu() {
        return commodityTypeDao.getAllzhu();
    }

    @Override
    public List<CommodityType> getAllzho() {
        return commodityTypeDao.getAllzho();
    }
}
