package com.shop.service;

import com.github.pagehelper.PageHelper;
import com.shop.dao.WarehouseDao;
import com.shop.vo.PageVo;
import com.shop.vo.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*仓库实现*/
@Service
public class WarehouseServiceImpl implements WarehouseService
{

    @Autowired
    WarehouseDao warehouseDao;

    /**
     * 查询所有仓库信息
     * @param page 当前页
     * @param rows 一页展示多少条数据
     * @return
     */
    @Override
    public PageVo<Warehouse> queryAllWarehouse(int page, int rows) {
        PageVo<Warehouse> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(warehouseDao.queryAllWarehouse());
        pageVo.setTotal(warehouseDao.queryCountWarehouse());
        return pageVo;
    }

    /**
     * 根据编号 修改仓库信息
     * @param warehouse
     * @return
     */
    @Override
    public int updateWarehouseById(Warehouse warehouse) {
        return warehouseDao.updateWarehouseById(warehouse);
    }

    /**
     * 仓库信息添加
     * @param warehouse
     * @return
     */
    @Override
    public int addWarehouse(Warehouse warehouse) {
        Warehouse warehouses=warehouseDao.queryWarehouseByName(warehouse.getName());
        if (warehouses != null){
            return 0;
        }
        return warehouseDao.addWarehouse(warehouse);
    }
}
