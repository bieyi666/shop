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


    /**
     * 根据编号 修改仓库信息
     * @param warehouse
     * @return
     */
    public int updateWarehouseById(Warehouse warehouse);


    /**
     * 仓库信息添加
     * @param warehouse
     * @return
     */
    public int addWarehouse(Warehouse warehouse);


}
