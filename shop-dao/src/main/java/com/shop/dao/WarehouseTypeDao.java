package com.shop.dao;

import com.shop.vo.WarehouseType;

import java.util.List;

/*仓库类型*/
public interface WarehouseTypeDao {

    /**
     * 查询所有仓库类型
     * @return
     */
    public List<WarehouseType> queryAllWarehouseType();

    /**
     * 查询仓库类型总数
     * @return
     */
    public int queryCountWarehouseType();

}
