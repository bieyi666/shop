package com.shop.service;

import com.github.pagehelper.PageHelper;
import com.shop.dao.WarehouseGoodsDao;
import com.shop.vo.PageVo;
import com.shop.vo.WarehouseGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//仓库商品
@Service
public class WarehouseGoodsServiceImpl implements WarehouseGoodsService
{

    @Autowired
    WarehouseGoodsDao warehouseGoodsDao;


    /**
     * 查询所有仓库商品
     * @return
     */
    @Override
    public List<WarehouseGoods> queryAllWarehouseGoods(int id) {
        return warehouseGoodsDao.queryAllWarehouseGoods(id);
    }

    /**
     *分组查询
     * @return
     */
    @Override
    public PageVo<WarehouseGoods> queryWarehouseGoodsByGroup(int page,int rows) {
        PageVo<WarehouseGoods> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(warehouseGoodsDao.queryWarehouseGoodsByGroup());
        pageVo.setTotal(warehouseGoodsDao.queryCountWarehouseGoodsByGroup());
        return pageVo;
    }
}
