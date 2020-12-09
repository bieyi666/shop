package com.shop.dao;

import com.shop.vo.Warehouse;

import java.util.List;

/*仓库*/
public interface WarehouseDao {

    /**
     * 查询所有仓库信息
     * @return
     */
    public List<Warehouse> queryAllWarehouse();

    /**
     * 查询仓库总数
     * @return
     */
    public int queryCountWarehouse();




}
