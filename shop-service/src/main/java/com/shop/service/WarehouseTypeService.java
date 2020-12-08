package com.shop.service;

import com.shop.vo.PageVo;
import com.shop.vo.WarehouseType;

import java.util.List;

/*仓库类型*/
public interface WarehouseTypeService {

    /**
     * 查询所有仓库类型信息
     * @param page 当前页
     * @param rows 一页总条数
     * @return
     */
    public PageVo<WarehouseType> queryAllWarehouseType(int page, int rows);
}
