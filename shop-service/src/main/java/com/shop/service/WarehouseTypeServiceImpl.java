package com.shop.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shop.dao.WarehouseDao;
import com.shop.dao.WarehouseTypeDao;
import com.shop.vo.PageVo;
import com.shop.vo.Warehouse;
import com.shop.vo.WarehouseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//仓库类型
@Service
public class WarehouseTypeServiceImpl implements WarehouseTypeService
{
    @Autowired
    WarehouseTypeDao warehouseTypeDao;

    @Autowired
    WarehouseDao warehouseDao;

    /**
     * 查询所有仓库类型信息
     * @param page 当前页
     * @param rows 一页总条数
     * @return
     */
    @Override
    public PageVo<WarehouseType> queryAllWarehouseType(int page, int rows) {
        PageVo<WarehouseType> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(warehouseTypeDao.queryAllWarehouseType());
        pageVo.setTotal(warehouseTypeDao.queryCountWarehouseType());
        return pageVo;
    }

    /**
     * 根据编号修改仓库类型
     * @param WarehouseType
     * @return
     */
    @Override
    public int updateWarehouseTypeById(WarehouseType WarehouseType) {
        return warehouseTypeDao.updateWarehouseTypeById(WarehouseType);
    }

    /**
     * 根据编号 查询仓库类型
     * @param id
     * @return
     */
    @Override
    public WarehouseType queryWarehouseTypeById(int id) {
        return warehouseTypeDao.queryWarehouseTypeById(id);
    }

    /**
     * 查询所有仓库类型 没有分页
     * @return
     */
    @Override
    public List<WarehouseType> queryAllWarehouseTypes() {
        return warehouseTypeDao.queryAllWarehouseTypes();
    }

    /**
     * 仓库类型 添加
     * @param warehouseType
     * @return
     */
    @Override
    public int addWarehouseType(WarehouseType warehouseType) {
        WarehouseType warehouseTypes=warehouseTypeDao.queryWarehouseTypeByName(warehouseType.getName());
        if (warehouseTypes == null){
            return warehouseTypeDao.addWarehouseType(warehouseType);
        }
        return 0;
    }

    /**
     * 根据编号 删除仓库（逻辑删除 0）
     * @param id
     * @return
     */
    @Override
    public int delWarehouseTypeById(int id) {
        List<Warehouse> list=warehouseDao.queryWarehouseBytId(id);
        if (list.size() <=0){
          return warehouseTypeDao.delWarehouseTypeById(id);
        }
        return 0;
    }


}
