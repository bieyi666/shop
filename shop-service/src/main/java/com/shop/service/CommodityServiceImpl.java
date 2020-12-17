package com.shop.service;

import com.github.pagehelper.PageHelper;
import com.shop.dao.CommodityDao;
import com.shop.vo.Commodity;
import com.shop.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//商品
@Service
public class CommodityServiceImpl implements CommodityService
{

    @Autowired
    CommodityDao commodityDao;

    /**
     *根据条件查询所以商品信息
     * @param commodity
     * @return
     */
    @Override
    public PageVo<Commodity> queryAllCommodity(Commodity commodity,int page,int rows) {
        PageVo<Commodity> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(commodityDao.queryAllCommodity(commodity));
        pageVo.setTotal(commodityDao.queryCountCommodity(commodity));
        return pageVo;
    }
}
