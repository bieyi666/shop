package com.shop.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shop.dao.WarehouseTypeDao;
import com.shop.vo.PageVo;
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
}
