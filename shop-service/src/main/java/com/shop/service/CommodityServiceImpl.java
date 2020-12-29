package com.shop.service;

import com.github.pagehelper.PageHelper;
import com.shop.dao.CommodityDao;
import com.shop.vo.Commodity;
import com.shop.vo.PageVo;
import com.shop.vo.WarehouseGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 根据商品编号 修改商品信息
     * @param commodity
     * @return
     */
    @Override
    public int updateCommodityByPid(Commodity commodity) {
        return commodityDao.updateCommodityByPid(commodity);
    }
    //根据类型查询
    @Override
    public List<Commodity> queryAllCommodityer(Commodity commodity) {
        return commodityDao.queryAllCommodityer(commodity);
    }

    @Override
    public int insertCommodity(Commodity commodity) {
        return commodityDao.insertCommodity(commodity);
    }

    //根据id查询单条
    @Override
    public Commodity queryCommodityById(int cid) {
        return commodityDao.queryCommodityById(cid);
    }
    //逻辑删除商品
    @Override
    public int delCommodityById(int id) {
        return commodityDao.delCommodityById(id);
    }

    //模糊查询商品
    @Override
    public List<Commodity> queryAllCommoditysan(Commodity commodity) {
        return commodityDao.queryAllCommoditysan(commodity);
    }
    //上面为供货商代码  不可修改 可使用————————————————————————————————————————————————————————————————————
}
