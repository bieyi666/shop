package com.shop.service;

import com.github.pagehelper.PageHelper;
import com.shop.dao.WarehouseDao;
import com.shop.dao.WarehouseGoodsDao;
import com.shop.vo.PageVo;
import com.shop.vo.Warehouse;
import com.shop.vo.WarehouseGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

//仓库商品
@Service
public class WarehouseGoodsServiceImpl implements WarehouseGoodsService {

    @Autowired
    WarehouseGoodsDao warehouseGoodsDao;
    @Autowired
    WarehouseDao warehouseDao;


    /**
     * 查询所有仓库商品
     *
     * @return
     */
    @Override
    public List<WarehouseGoods> queryAllWarehouseGoods(int id) {
        return warehouseGoodsDao.queryAllWarehouseGoods(id);
    }

    /**
     * 分组查询
     *
     * @return
     */
    @Override
    public PageVo<WarehouseGoods> queryWarehouseGoodsByGroup(int page, int rows) {
        PageVo<WarehouseGoods> pageVo = new PageVo<>();
        PageHelper.startPage(page, rows);
        pageVo.setRows(warehouseGoodsDao.queryWarehouseGoodsByGroup());
        pageVo.setTotal(warehouseGoodsDao.queryCountWarehouseGoodsByGroup());
        return pageVo;
    }


    /**
     * 添加仓库商品
     *
     * @param warehouseGoods
     * @return
     */
    @Override
    public int addWarehouseGoods(WarehouseGoods warehouseGoods) {
        List<WarehouseGoods> list=  warehouseGoodsDao.queryWarehouseGoodsByIds(warehouseGoods);
        if (list.size()>0){
            int num=warehouseGoodsDao.updateWarehouseGoods(warehouseGoods);
            if (num > 0){
                return 1;
            }
        }

        return warehouseGoodsDao.addWarehouseGoods(warehouseGoods);
    }

    /**
     * 条件查询
     *
     * @param warehouseGoods
     * @return
     */
    @Override
    public List<WarehouseGoods> queryWarehouseGoodsById(WarehouseGoods warehouseGoods) {

        Warehouse warehouse = warehouseDao.queryWarehouseById(warehouseGoods.getWId());
        List<WarehouseGoods> list = warehouseGoodsDao.queryWarehouseGoodsById(warehouseGoods);
        Collection nuCon = new Vector();
        nuCon.add(null);
        list.removeAll(nuCon);

        int a = warehouseGoods.getStock();
        int b = 0;
        int c = 0;

        if (list != null && list.size() != 0) {
            b = list.get(0).getStock();
            c = a + b;
            if (c > warehouse.getCapacity()) {
                return null;
            }
            return list;
        } else {

            c = a + b;
            if (c > warehouse.getCapacity()) {
                return null;
            }
            List<WarehouseGoods> lists=new ArrayList<>();
            lists.add(warehouseGoods);
            return lists;
        }
    }

}
