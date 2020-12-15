package com.shop.service;

import com.shop.vo.PageVo;
import com.shop.vo.Warehouse;

import java.util.List;

/*仓库*/
public interface WarehouseService {

    /**
     * 查询所有仓库信息
     * @param page 当前页
     * @param rows 一页展示多少条数据
     * @return
     */
    public PageVo<Warehouse> queryAllWarehouse(int page,int rows);

    /**
     * 根据编号 修改仓库信息
     * @param warehouse
     * @return
     */
    public int updateWarehouseById(Warehouse warehouse);
}
